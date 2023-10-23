drop database if exists quan_ly_net;
create database if not exists quan_ly_net;
use quan_ly_net;
create table loai_khach_hang(
ma_loai_khach_hang int primary key auto_increment,
ten_loai_khach_hang varchar(45)
);
insert into loai_khach_hang(ten_loai_khach_hang) values ('Vip'),('Member'),('Other');
create table khach_hang(
ma_khach_hang int primary key auto_increment,
ten_khach_hang varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
ma_loai_khach_hang int,
foreign key(ma_loai_khach_hang) references loai_khach_hang(ma_loai_khach_hang)
);
insert into khach_hang(ten_khach_hang,so_dien_thoai,email,ma_loai_khach_hang)  values('Phạm Thanh Hữu','09512312312','huu@gmail.com',3),('Trần Anh Tuấn','0387274038','tuan@gmail.com',1),('Phan Văn Toại','036132132','toai@gmail.com',2);
create table may_tinh(
ma_may int primary key auto_increment,
hang_san_xuat varchar(45),
vi_tri_dat_may varchar(45),
gia_su_dung int
);
create table dich_vu_di_kem(
ma_loai_dich_vu int primary key auto_increment,
ten_dich_vu varchar(45),
gia int
);
insert into dich_vu_di_kem(ten_dich_vu,gia) values('Nước ngọt',20000),('Bánh mì',15000),('mì tôm',10000);
create table dich_vu_chi_tiet(
ma_dich_vu_chi_tiet int primary key auto_increment,
ma_loai_dich_vu int,
foreign key (ma_loai_dich_vu) references dich_vu_di_kem(ma_loai_dich_vu),
so_luong int
);
create table thong_tin_quan_ly(
ma_thong_tin_quan_ly int primary key auto_increment,
ma_may int,
foreign key (ma_may) references may_tinh(ma_may),
ma_khach_hang int,
foreign key (ma_khach_hang) references khach_hang(ma_khach_hang),
start_time datetime,
end_time datetime,
ma_dich_vu_chi_tiet int,
foreign key(ma_dich_vu_chi_tiet) references dich_vu_chi_tiet(ma_dich_vu_chi_tiet)
);


