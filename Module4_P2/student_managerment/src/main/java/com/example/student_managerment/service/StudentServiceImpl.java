package com.example.student_managerment.service;

import com.example.student_managerment.model.Student;
import com.example.student_managerment.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    IStudentRepository iStudentRepository;
    @Override
    public Page<Student> displayAllStudent(String name, Pageable pageable) {
        return iStudentRepository.search("%" + name + "%" , pageable);
    }

    @Override
    public void addNewStudent(Student student) {

    }

    @Override
    public void removeStudent(int id) {

    }

    @Override
    public void editStudent(Student student) {

    }

    @Override
    public void showDetail(int id) {

    }
}
