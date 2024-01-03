package com.example.thim4.service;

import com.example.thim4.model.TheLoai;
import com.example.thim4.repository.ITheLoaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheLoaiService implements ITheLoaiService {
    @Autowired
    ITheLoaiRepository iTheLoaiRepository;
    @Override
    public List<TheLoai> hienThiTheLoai() {
        return iTheLoaiRepository.findAll();
    }
}
