package com.example.front_end.service;

import com.example.front_end.model.NhanVien;

import java.util.List;

public interface INhanVienMuonService {
    List<NhanVien> nhanVienList();
    NhanVien findById(int id);
}
