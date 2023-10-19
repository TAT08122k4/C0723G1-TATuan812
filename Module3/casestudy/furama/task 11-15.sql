use quan_ly_furama;
-- task 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”. -- 
SELECT 
    kh.ma_khach_hang, kh.ho_ten, dvdk.*
FROM
    hop_dong_chi_tiet hdct
        JOIN
    dich_vu_di_kem dvdk ON hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
        JOIN
    hop_dong hd ON hdct.ma_hop_dong = hd.ma_hop_dong
        JOIN
    khach_hang kh ON hd.ma_khach_hang = kh.ma_khach_hang
        JOIN
    loai_khach lk ON kh.ma_loai_khach = lk.ma_loai_khach
WHERE
    lk.ten_loai_khach = 'Diamond'
        AND (kh.dia_chi LIKE '%Vinh%'
       OR kh.dia_chi LIKE '%Quảng Ngãi%')nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021 --
-- task 12 -- 
select hd.ma_hop_dong,nv.ho_ten as ho_ten_nhan_vien,kh.ho_ten as ho_ten_khach_hang,kh.so_dien_thoai,dv.ten_dich_vu,sum(hdct.so_luong) as so_luong,hd.tien_dat_coc
from hop_dong hd
left join nhan_vien nv on hd.ma_nhan_vien = nv.ma_nhan_vien
left join khach_hang kh on hd.ma_khach_hang = kh.ma_khach_hang
left join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
left join dich_vu_di_kem dvdk on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
left join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
where year(hd.ngay_lam_hop_dong) = 2020 
and quarter(hd.ngay_lam_hop_dong) = 4
and hd.ma_dich_vu not in ( select hd.ma_dich_vu from hop_dong hd
where year(hd.ngay_lam_hop_dong) = '2021'and (quarter(hd.ngay_lam_hop_dong) = '1' or quarter(hd.ngay_lam_hop_dong) = '2'))
group by hd.ma_hop_dong;
-- task 13 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau). -- 
select hdct.ma_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem,sum(hdct.so_luong) as so_luong_dich_vu_di_kem
from hop_dong_chi_tiet hdct
join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
group by hdct.ma_dich_vu_di_kem
having sum(so_luong) = (select sum(so_luong) from hop_dong_chi_tiet hdct
    group by hdct.ma_dich_vu_di_kem
    order by sum(so_luong) desc
    limit 1);
-- task 14 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem). --
select hd.ma_hop_dong,ldv.ten_loai_dich_vu,dvdk.ten_dich_vu_di_kem,count(hdct.ma_dich_vu_di_kem) as so_lan_su_dung
from hop_dong hd
join dich_vu dv on hd.ma_dich_vu = dv.ma_dich_vu
join loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
where hdct.ma_dich_vu_di_kem in (
select ma_dich_vu_di_kem
from hop_dong_chi_tiet hdct
group by ma_dich_vu_di_kem
having count(hdct.ma_dich_vu_di_kem) = 1)
group by hd.ma_hop_dong, hdct.ma_dich_vu_di_kem
order by hdct.ma_hop_dong;
-- task 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021. --
select nv.ma_nhan_vien,nv.ho_ten,td.ten_trinh_do,bp.ten_bo_phan,nv.so_dien_thoai,nv.dia_chi from nhan_vien nv
join trinh_do td on nv.ma_trinh_do = td.ma_trinh_do
join bo_phan bp on bp.ma_bo_phan = nv.ma_bo_phan
join hop_dong hd on nv.ma_nhan_vien = hd.ma_nhan_vien
where (year(hd.ngay_lam_hop_dong) between 2020 and 2021)
group by nv.ma_nhan_vien
having count(hd.ma_nhan_vien) <= 3
order by nv.ma_nhan_vien;