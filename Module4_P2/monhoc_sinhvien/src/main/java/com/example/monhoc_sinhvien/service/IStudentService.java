package com.example.monhoc_sinhvien.service;

import com.example.monhoc_sinhvien.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentRepository {
    Page<Student> getAllStudentPage(Pageable pageable , String tenHocVien , Integer idMonHoc);
}
