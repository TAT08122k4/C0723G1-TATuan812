package com.example.monhoc_sinhvien.service;

import com.example.monhoc_sinhvien.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentService {
    Page<Student> getAllStudentPage(Pageable pageable , String tenHocVien , Integer idMonHoc);
    List<Student> findAll();
}
