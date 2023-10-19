use quan_ly_furama;
-- task 16 -- 
drop view w_nhan_vien;
create view w_nhan_vien as
select nv.ma_nhan_vien, nv.ho_ten 
from nhan_vien nv
join hop_dong hd on nv.ma_nhan_vien = hd.ma_nhan_vien;

delete from w_nhan_vien where nv.ma_nhan_vien not in (select hd.ngay_lam_hop_dong from hop_dong hd
where (year(hd.ngay_lam_hop_dong) between 2019 and 2021));

select * from w_nhan_vien;
select * from nhan_vien;
-- task 17 	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 1.000.000 VNĐ. -- 
drop view w_khach_hang;
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
create view w_khach_hang as
select kh.ma_khach_hang,kh.ho_ten,lk.ma_loai_khach ,(IFNULL(dv.chi_phi_thue, 0) + SUM(ifnull(hdct.so_luong , 0) * IFNULL(dvdk.gia, 0))) AS tong_tien
from khach_hang kh
left join loai_khach lk on lk.ma_loai_khach = kh.ma_loai_khach
left join hop_dong hd on hd.ma_khach_hang = kh.ma_khach_hang
left join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
left join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
left join dich_vu dv on dv.ma_dich_vu = hd.ma_dich_vu
where (year(hd.ngay_lam_hop_dong) = '2021') and lk.ten_loai_khach ='Platinium'
group by kh.ma_khach_hang
having tong_tien > 1000000;
update khach_hang set ma_loai_khach = 1
where ma_loai_khach = 2
and ma_loai_khach in (select ma_loai_khach from w_khach_hang);
select * from w_khach_hang;
select * from khach_hang;
-- task 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng). -- 
drop view w_xoa_khach_hang;
create view w_xoa_khach_hang as select kh.ma_khach_hang,kh.ho_ten 
from khach_hang kh  
join hop_dong hd on hd.ma_khach_hang = kh.ma_khach_hang
where (year(hd.ngay_lam_hop_dong)< '2021');
select * from w_xoa_khach_hang;
alter table khach_hang
add deleted bit
default 0;
set sql_safe_updates = 0;
with temp as (select ma_khach_hang from w_xoa_khach_hang)
update khach_hang kh
set deleted = 1
where kh.ma_khach_hang in (select* from temp);
select * from khach_hang 
where deleted = 0;
-- task 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi. -- 
drop view w_cap_nhat_gia_dich_vu;
create view w_cap_nhat_gia_dich_vu as select dvdk.gia,dvdk.ma_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
join hop_dong hd on hd.ma_hop_dong = hdct.ma_hop_dong
where (year(hd.ngay_lam_hop_dong) = '2020' and hdct.so_luong > 10);
select * from w_cap_nhat_gia_dich_vu;
with temp as (select ma_dich_vu_di_kem from w_cap_nhat_gia_dich_vu)
update dich_vu_di_kem  
set gia = gia * 2
where ma_dich_vu_di_kem in (select * from temp);
-- task 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi. -- 
select ma_nhan_vien id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi
from nhan_vien
union select ma_khach_hang id, ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi
from khach_hang;




