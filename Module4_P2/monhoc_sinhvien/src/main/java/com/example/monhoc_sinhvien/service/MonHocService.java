package com.example.monhoc_sinhvien.service;

import com.example.monhoc_sinhvien.model.MonHoc;
import com.example.monhoc_sinhvien.repository.IMonHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MonHocService implements IMonHocService{
    @Autowired
    IMonHocRepository iMonHocRepository;
    @Override
    public Page<MonHoc> getAllMonHocPage(Pageable pageable, String tenMonHoc, int idMonHoc) {
        return iMonHocRepository.getAllMonHocPage(pageable,tenMonHoc,idMonHoc);
    }

    @Override
    public void save(MonHoc monHoc) {
        iMonHocRepository.save(monHoc);
    }

    @Override
    public void deleteMonHocById(int id) {
        iMonHocRepository.deleteById(id);
    }

    @Override
    public MonHoc findById(int id) {
        return iMonHocRepository.findById(id).get();
    }
}
