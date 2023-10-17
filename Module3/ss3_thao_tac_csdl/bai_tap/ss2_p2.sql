create database quan_ly_product;
use quan_ly_product;
create table customer (
customer_id int primary key ,
customer_name varchar(25),
customer_age tinyint
);
select * from customer;
insert into customer values (1,"Minh Quan",10),(2,"Ngoc Oanh",20),(3,"Hong Ha	",50);
create table orders(
order_id int primary key,
customer_id int,
foreign key (customer_id) references customer(customer_id),
order_date datetime,
order_total_price int
);
insert into orders values (1,1,'2006-03-21',null),(2,2,'2006-03-26',null),(3,1,'2006-03-16',null);
create table products(
product_id int primary key,
product_name varchar(25),
product_price int
);
insert into products values (1,"May Giat",3),(2,"Tu Lanh",5),(3,"Dieu Hoa",7),(4,"Quat",1),(5,"Bep Dien",2);
create table order_detail(
order_id int,
foreign key(order_id) references orders(order_id),
product_id int,
foreign key(product_id) references products(product_id),
order_quantity int
);
insert into order_detail values(1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);
select order_id , order_date,order_total_price from orders;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách --
select  c.customer_name , p.product_name
from customer c
join orders o on c.customer_id = o.customer_id
join order_detail od on o.order_id = od.order_id
join products p on od.product_id = p.product_id;
 -- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào --
 select c.customer_name from customer c
 left join orders o on c.customer_id = o.customer_id
--  where c.customer_id not in (select distinct customer_id
--  from orders
-- );	
where o.customer_id is null;
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice) --
select o.order_id , o.order_date , sum(order_quantity * p.product_price) from orders o 
join order_detail od on o.order_id = od.order_id
join products p on od.product_id = p.product_id
group by o.order_id;
