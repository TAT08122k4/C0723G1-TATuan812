package com.example.demo.service;

import com.example.demo.model.Tranh;
import com.example.demo.repository.ITranhRepository;
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
