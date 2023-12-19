package com.example.demo.service;

import com.example.demo.model.Tranh;

import java.util.List;


public interface ITranhService {
    public List<Tranh> hienThiTacPham();
    public void themTacPham(Tranh tranh);
    public void xoaTacPham(int id);
}
