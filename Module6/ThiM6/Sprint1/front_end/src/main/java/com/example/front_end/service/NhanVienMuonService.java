package com.example.front_end.service;

import com.example.front_end.model.NhanVien;
import com.example.front_end.repository.INhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienMuonService implements INhanVienMuonService{
    @Autowired
    INhanVienRepository nhanVienRepository;
    @Override
    public List<NhanVien> nhanVienList() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien findById(int id) {
        return nhanVienRepository.findById(id).get();
    }
}
