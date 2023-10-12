drop database if exists quan_ly_don_dat_hang;
create database if not exists quan_ly_don_dat_hang;
use quan_ly_don_dat_hang;
create table phieu_xuat(
so_px int primary key auto_increment,
ngay_xuat date
);
create table vat_tu(
ma_vat_tu int primary key auto_increment,
ten_vat_tu varchar(50)
);
create table chi_tiet_phieu_xuat(
dg_xuat int,
so_luong_xuat int ,
so_px int,
ma_vat_tu int,
foreign key(so_px) references phieu_xuat(so_px),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu) 
);
create table phieu_nhap(
so_pn int primary key auto_increment,
ngay_nhap int
);
create table chi_tiet_phieu_nhap(
dg_nhap int,
sl_nhap int,
ma_vat_tu int,
so_pn int,
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_pn) references phieu_nhap(so_pn)
);
create table don_dh(
so_dh int primary key auto_increment,
ngay_dh int
);
create table chi_tiet_don_dat_hang(
ma_vat_tu int,
so_dh int,
primary key(ma_vat_tu,so_dh),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key(so_dh) references don_dh(so_dh)
);
create table nha_cung_cap(
ma_nha_cung_cap int primary key,
ten_nha_cung_cap varchar(50),
dia_chi varchar(50)
);
create table cung_cap(
so_dh int,
ma_nha_cung_cap int,
foreign key(so_dh) references don_dh(so_dh),
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);
create table so_dien_thoai(
ma_nha_cung_cap int,
so_dien_thoai varchar(50),
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);




