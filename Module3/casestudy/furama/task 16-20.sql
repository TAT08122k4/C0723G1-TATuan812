use quan_ly_furama;
-- task 16 -- 
drop view w_nhan_vien;
create view w_nhan_vien as select distinct nv.ma_nhan_vien,nv.ho_ten 
from nhan_vien nv
join hop_dong hd on nv.ma_nhan_vien = hd.ma_nhan_vien;
delete from w_nhan_vien where nv.ma_nhan_vien not in (select hd.ngay_lam_hop_dong from hop_dong hd
where (year(hd.ngay_lam_hop_dong) between 2019 and 2021));
select * from w_nhan_vien;
-- task 17 -- 
select * from 
