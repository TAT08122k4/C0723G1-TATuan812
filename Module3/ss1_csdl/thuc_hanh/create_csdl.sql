CREATE database ss1_create_csdl;
select * from student;
create table Student(
id int,
`name` varchar(200),
age int,
country varchar(50) 
);
select * from student_management;
create table student_management(
id int primary key,
`name` varchar(50)
);
insert into student_management(id,name)values(1,"Tuấn");
insert into student_management(id,name)values(2,"Kiệt");
insert into student_management values(3,"Hiếu");
delete from student_management where id = 2;
update student_management set name = "Minh Tuấn" where id = 3;
update student_management set id = 2 where name = "Minh Tuấn";
set sql_safe_updates = 0;

select * from teacher_management;
create table teacher_management(
id int primary key auto_increment,
`name` varchar(50),
age int,
country varchar(30)
);