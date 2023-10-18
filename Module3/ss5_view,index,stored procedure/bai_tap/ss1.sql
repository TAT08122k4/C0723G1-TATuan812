drop database if exists ss5_demo;
create database if not exists ss5_demo; 
use ss5_demo;
create table products(
id int primary key auto_increment,
product_code varchar(45),
product_name varchar(45),
product_price int,
product_amount int,
product_description varchar(45),
product_status boolean
);
insert into products(product_code,product_name,product_price,product_amount,product_description,product_status) 
values("P-001","IP13",2500,13,"99%",true),
("P-002","IP8",500,7,"80%",true),
("P-003","IPX",1000,5,"90%",true),
("P-004","IP7",300,13,"95%",false);
-- tạo index -- 
-- create index p_product_code on products(product_code); --
-- tạo composite index --
create index p_name_price on products(product_name,product_price);
-- explain -- 
explain select * from products where product_code = 'P-003';  -- khi chưa index sẽ tìm kiếm trên 4 rows --
-- so sánh truy vấn trc và sau khi tạo index --
create index p_product_code on products(product_code);
explain select * from products where product_code = 'P-003'; -- khi có index chỉ tìm kiếm trên 1 row --
-- ====================== B4 =============================== --
-- tạo view --
create view w_products as select p.product_code,p.product_name,p.product_price,p.product_status from  products p;
select * from w_products;
-- update view --
update w_products set product_name = 'IP14' where product_name = 'IP7';
-- delete view --
drop view w_products;
-- ======================= B5 ======================= --
-- lấy thông tin của tất cả sản phẩm --
delimiter //
create procedure get_all_products()
begin 
select * from products;
end //
delimiter ;
call get_all_products();
-- thêm một sản phẩm mới --
delimiter // 
create procedure add_new_product(p_code varchar(45),p_name varchar(45),p_price int,p_amount int,p_description varchar(45),p_status boolean)
begin 
insert into products(product_code,product_name,product_price,product_amount,product_description,product_status)  
value (p_code,p_name,p_price,p_amount,p_description,p_status);
end // 
delimiter ;
call add_new_product('P-005','IP7',200,10,'98%',true);
-- cập nhật  --

delimiter //
create procedure update_product(p_id int,p_code varchar(45),p_name varchar(45),p_price int,p_amount int,p_des varchar(45),p_status boolean)
begin 
update products set product_code = p_code where id = p_id;
update products set product_name = p_name where id = p_id;
update products set product_price = p_price where id = p_id;
update products set product_amount = p_amount where id = p_id;
update products set product_description = p_des where id = p_id;
update products set product_status = p_status where id = p_id;
end //p_
delimiter ;
set sql_safe_updates =1;
call update_product(5,'P-006','IP11',1200,14,"97%",true);
-- xoá sản phẩm --
delimiter //
create procedure delete_product(p_id int)
begin 
delete from products where id = p_id;
end //
delimiter ;
call delete_product(2);
select * from products












