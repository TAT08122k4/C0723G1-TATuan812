package com.example.thim4.service;

import com.example.thim4.model.Tranh;

import java.util.List;


public interface ITranhService {
    public List<Tranh> hienThiTacPham();
    public void themTacPham(Tranh tranh);
    public void xoaTacPham(int id);
}
