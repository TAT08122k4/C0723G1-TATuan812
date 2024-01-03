package com.example.quan_ly_student_ss3.repository;

import com.example.quan_ly_student_ss3.model.Student;

import java.util.List;

public interface IStudentRepository {
    void addNewStudent(Student student);
    void editStudent(int id,Student student);
    void deleteStudent(int id);
    List<Student> displayAll();
    Student findById(int id);
    List<Student> searchByGender(String gender);


}
