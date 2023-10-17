use quan_ly_furama;
 -- task 4 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”. --
select kh.ma_khach_hang , kh.ho_ten , count(hd.ma_khach_hang) as tong_dat_phong from khach_hang kh
join hop_dong hd on kh.ma_khach_hang = hd.ma_khach_hang
join loai_khach lk on lk.ma_loai_khach = kh.ma_loai_khach 
where lk.ten_loai_khach = 'Diamond'
group by kh.ma_khach_hang, kh.ho_ten
order by tong_dat_phong ; 

-- task 5  -- 
SELECT 
    kh.ma_khach_hang,
    kh.ho_ten,
    lk.ten_loai_khach,
    hd.ma_hop_dong,
    dv.ten_dich_vu,
    hd.ngay_lam_hop_dong,
    hd.ngay_ket_thuc,
    (IFNULL(dv.chi_phi_thue, 0) + SUM(ifnull(hdct.so_luong , 0) * IFNULL(dvdk.gia, 0))) AS tong_tien
FROM
    khach_hang kh
        JOIN
    loai_khach lk ON lk.ma_loai_khach = kh.ma_loai_khach
	left JOIN
    hop_dong hd ON hd.ma_khach_hang = kh.ma_khach_hang
       left JOIN
    hop_dong_chi_tiet hdct ON hd.ma_hop_dong = hdct.ma_hop_dong
       left JOIN
    dich_vu dv ON dv.ma_dich_vu = hd.ma_dich_vu
        left JOIN
    dich_vu_di_kem dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
    group by kh.ma_khach_hang , hd.ma_hop_dong
    order by kh.ma_khach_hang;
    


-- task 6 Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3) --
select dv.ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu 
from dich_vu dv
join loai_dich_vu ldv on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
where ma_dich_vu not in (
select distinct ma_dich_vu
from hop_dong
where ngay_lam_hop_dong between '2021-01-01' and '2021-03-31');

-- task 7 -- 
select dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.so_nguoi_toi_da,dv.chi_phi_thue, ldv.ten_loai_dich_vu 
from dich_vu dv
join loai_dich_vu ldv on ldv.ma_loai_dich_vu = dv.ma_loai_dich_vu
join hop_dong hd on hd.ma_dich_vu = dv.ma_dich_vu
where year(hd.ngay_lam_hop_dong) = 2020 and dv.ma_dich_vu not in (select ma_dich_vu from hop_dong where year(ngay_lam_hop_dong) =2021)
group by dv.ma_dich_vu;

-- task 8 -- 
 -- cách 1 -- 
 select ho_ten
from khach_hang 
group by ho_ten;
-- cách 2 -- 
select distinct ho_ten
FROM khach_hang;
-- cách 3 -- 
select ho_ten
from khach_hang 
union select ho_ten
from khach_hang; 
-- task 9 -- 
select month(hd.ngay_lam_hop_dong) as thang,count(hd.ma_hop_dong) as so_luong_khach_hang
from hop_dong hd
where year(hd.ngay_lam_hop_dong) = '2021'
group by month(hd.ngay_lam_hop_dong)
order by thang;
-- task 10 --
select hd.ma_hop_dong,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,sum(ifnull(so_luong, 0)) as 'so_luong_dich_vu_di_kem'
from hop_dong hd
left join hop_dong_chi_tiet hdct on hd.ma_hop_dong = hdct.ma_hop_dong
left join dich_vu_di_kem dvdk On hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
group by hd.ma_hop_dong;

