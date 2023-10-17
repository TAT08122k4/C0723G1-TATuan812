drop database if exists quan_ly_sinh_vien;
create database if not exists quan_ly_sinh_vien;
use quan_ly_sinh_vien;
CREATE TABLE class(
         class_id INT NOT NULL PRIMARY KEY,
          class_name VARCHAR(60) NOT NULL,
          start_date DATETIME NOT NULL,
          status BIT
);
CREATE TABLE student(
          student_id INT NOT NULL  PRIMARY KEY,
          student_name VARCHAR(30) NOT NULL,
          address VARCHAR(50),
          phone VARCHAR(20),
          status BIT,
          class_id INT NOT NULL,
          FOREIGN KEY (class_id) REFERENCES Class(class_id)
);
CREATE TABLE `subject`(
         sub_id INT NOT NULL  PRIMARY KEY,
         sub_name VARCHAR(30) NOT NULL,
         credit TINYINT NOT NULL DEFAULT 1 CHECK ( credit >= 1 ),
         status BIT DEFAULT 1
);
CREATE TABLE mark(

        mark_id INT NOT NULL PRIMARY KEY,

        sub_id INT NOT NULL,

        student_id INT NOT NULL,

        mark FLOAT DEFAULT 0 CHECK ( mark BETWEEN 0 AND 100),

        exam_times TINYINT DEFAULT 1,

        UNIQUE (sub_id, student_id),

        FOREIGN KEY (sub_id) REFERENCES `subject` (sub_id),

        FOREIGN KEY (student_id) REFERENCES student (student_id)
 );
 insert into class values(1,'A1','2008-12-20 00:00:00',1),
(2,'A2','2008-12-22 00:00:00'	,1),
(3,'B3','2023-10-15 00:00:00',0);
insert into student values (1,'Hung','Ha Noi','0912113113',1,2),
(2,'Hoa','Hai phong','0912113113',1,1),
(3,'Manh','HCM','0123123123',0,1);
insert into `subject` values(1,'CF',5,1),(2,'C',6,1),(3,'HDJ',5,1),(4,'RDBMS',10,1);
insert into mark values(1,1,1,8,1),(2,1,2,10,2),(3,2,1,12,1);
-- task 1 -- 
select *from `subject`
where credit = ( select max(credit) from `subject`);
-- task 2 --
select s.sub_name , m.mark from `subject` s 
join mark m on m.sub_id = s.sub_id
where mark = (select max(mark) from mark);
-- task 3--
select s.* , avg(mark) as avg_point
from student s 
join mark m on s.student_id = m.student_id
group by s.student_id
order by avg_point desc;


