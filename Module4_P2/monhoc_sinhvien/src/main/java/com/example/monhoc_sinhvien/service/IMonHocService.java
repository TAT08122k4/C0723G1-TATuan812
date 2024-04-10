package com.example.monhoc_sinhvien.service;

import com.example.monhoc_sinhvien.model.MonHoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IMonHocService {
    Page<MonHoc> getAllMonHocPage(Pageable pageable , String tenMonHoc,int idMonHoc);
    void save(MonHoc monHoc);
    void deleteMonHocById(int id);
    MonHoc findById(int id);
}
