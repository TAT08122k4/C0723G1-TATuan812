drop database if exists quan_ly_ban_hang;
create database  if  not exists quan_ly_ban_hang; 
use quan_ly_ban_hang;
create table customer(
customer_id int primary key auto_increment,
customer_name varchar(50),
customer_age varchar(50)
);
create table orders(
order_id int primary key,
customer_id int,
order_date datetime,
order_total_price int,
foreign key(customer_id) references customer(customer_id)
);
create table product(
product_id int primary key auto_increment,
product_name varchar(50),
product_price int
);
create table order_detail(
order_id int,
product_id int,
order_soluong int,
primary key(order_id,product_id),
foreign key(order_id) references orders(order_id),
foreign key(product_id) references product(product_id)  
);
select orders.order_id , orders.order_date , orders.order_total_price from orders;