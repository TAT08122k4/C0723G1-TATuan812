package com.example.student_managerment.service;

import com.example.student_managerment.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService {
    Page<Student> displayAllStudent(String name, Pageable pageable);
    void addNewStudent(Student student);
    void removeStudent(int id);
    void editStudent(Student student);
    void showDetail(int id);




}
