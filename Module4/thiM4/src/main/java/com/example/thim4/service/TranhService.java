package com.example.thim4.service;


import com.example.thim4.model.Tranh;
import com.example.thim4.repository.ITranhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranhService implements ITranhService{
    @Autowired
    ITranhRepository iTranhRepository;

    @Override
    public List<Tranh> hienThiTacPham() {
        return iTranhRepository.findAll();
    }

    @Override
    public void themTacPham(Tranh tranh) {
        iTranhRepository.save(tranh);
    }

    @Override
    public void xoaTacPham(int id) {
        iTranhRepository.deleteById(id);
    }
}
