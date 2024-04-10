package com.example.monhoc_sinhvien.service;

import com.example.monhoc_sinhvien.model.Student;
import com.example.monhoc_sinhvien.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{
    @Autowired
    IStudentRepository iStudentRepository;
    @Override
    public Page<Student> getAllStudentPage(Pageable pageable, String tenHocVien, Integer idMonHoc) {
        return iStudentRepository.getAllStudentPage(pageable,tenHocVien,idMonHoc);
    }

    @Override
    public List<Student> findAll() {
        return iStudentRepository.findAll();
    }
}
