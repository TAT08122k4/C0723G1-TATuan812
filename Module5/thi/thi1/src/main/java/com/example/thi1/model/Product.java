package com.example.thi1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Product {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
private String tenSanPham;
private Date ngayNhap;
private int soLuong;
private String loaiSanPham;

    public Product(int id, String tenSanPham, Date ngayNhap, int soLuong, String loaiSanPham) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.loaiSanPham = loaiSanPham;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }
}
