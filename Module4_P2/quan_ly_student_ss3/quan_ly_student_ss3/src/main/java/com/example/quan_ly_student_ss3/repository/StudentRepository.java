package com.example.quan_ly_student_ss3.repository;

import com.example.quan_ly_student_ss3.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"Tuấn","Nam",19,"Huế"));
        studentList.add(new Student(2,"Minh Tuấn","Nam",19,"Đà Nẵng"));
        studentList.add(new Student(3,"Khoa","Nam",24,"Đà Nẵng"));
        studentList.add(new Student(4,"Toại","Nữ",22,"Nghệ An"));
        studentList.add(new Student(5,"Quyền","Nam",22,"Quảng Ngãi"));
    }
    public List<Student> searchByGender(String gender){
        List<Student> studentList1 = new ArrayList<>();
       for (Student s : studentList){
           if (s.getGender().contains(gender)){
               studentList1.add(s);
           }
       }
       return studentList1;
    }

    @Override
    public void addNewStudent(Student student) {
          studentList.add(student);
    }

    @Override
    public void editStudent(int id , Student student) {
        Student student1 = findById(id);
       student1.setName(student.getName());
       student1.setGender(student.getGender());
       student1.setAge(student.getAge());
       student1.setAddress(student.getAddress());
    }

    @Override
    public void deleteStudent(int id) {
        for (Student s : studentList){
            if (s.getId() == id){
                studentList.remove(s);
                break;
            }
        }
    }
    @Override
    public List<Student> displayAll() {
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return Integer.compare(student.getAge(),t1.getAge());
            }
        });

        return studentList;
    }


    @Override
    public Student findById(int id) {
        for (Student s: studentList) {
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }
}
