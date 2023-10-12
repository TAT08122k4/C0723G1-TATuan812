CREATE database ss1_create_csdl;
select * from student;
select * from student_management;
create table student_management(
id_student int primary key,
name_student varchar(50)
);
insert into student_management(id_student,name_student)values(1,"Tuấn");
insert into student_management(id_student,name_student)values(2,"Kiệt");
insert into student_management values(3,"Hiếu");
delete from student_management where id_student = 2;
update student_management set name_student = "Minh Tuấn" where id_student = 3;
update student_management set id_student = 2 where name_student = "Minh Tuấn";
set sql_safe_updates = 0;

select * from teacher_management;
create table teacher_management(
id_teacher int primary key auto_increment,
name_teacher varchar(50),
age_teacher int,
country_teacher varchar(30)
);