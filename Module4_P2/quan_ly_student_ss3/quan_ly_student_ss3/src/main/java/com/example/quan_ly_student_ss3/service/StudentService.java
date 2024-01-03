package com.example.quan_ly_student_ss3.service;

import com.example.quan_ly_student_ss3.model.Student;
import com.example.quan_ly_student_ss3.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{
    @Autowired
     private IStudentRepository iStudentRepository;
    @Override
    public void addNewStudent(Student student) {
        iStudentRepository.addNewStudent(student);
    }

    @Override
    public void editStudent(int id , Student student ) {
        iStudentRepository.editStudent(id,student);

    }

    @Override
    public void deleteStudent(int id) {
        iStudentRepository.deleteStudent(id);

    }

    @Override
    public List<Student> displayAll() {
        return iStudentRepository.displayAll();
    }

    @Override
    public Student findById(int id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public List<Student> searchByGender(String gender) {
        return iStudentRepository.searchByGender(gender);
    }
}
