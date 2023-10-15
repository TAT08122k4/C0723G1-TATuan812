drop database if exists quan_ly_sinh_vien;
create database if not exists quan_ly_sinh_vien;
use quan_ly_sinh_vien;
create table Customer (
cId int primary key ,
name varchar(25),
cAge tinyint
);
insert into Customer values (1,"Minh Quan",10),(2,"Ngoc Oanh",20),(3,"Hong Ha	",50);
create table Orders(
oId int primary key,
cId int,
foreign key (cId) references Customer(cId),
oDate datetime,
oToTalPrice int
);
insert into Orders(oId,oDate,oTotalPrice) values (1,'2006-03-21',null),(2,'2006-03-26',null),(3,'2006-03-16',null);
create table Products(
pId int primary key,
pName varchar(25),
pPrice int
);
insert into Products values (1,"May Giat",3),(2,"Tu Lanh",5),(3,"Dieu Hoa",7),(4,"Quat",1),(5,"Bep Dien",2);
create table OrderDetail(
oId int,
foreign key(oId) references Orders(oId),
pId int,
foreign key(pId) references Products(pId),
odQTY int
);
insert into OrderDetail values(1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);
select oId , oDate,oTotalPrice from Orders;
	
