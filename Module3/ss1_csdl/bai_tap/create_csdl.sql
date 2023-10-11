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
select * from teacher_management;
create table teacher_management(
id int primary key auto_increment,
`name` varchar(50),
age int,
country varchar(30)
);