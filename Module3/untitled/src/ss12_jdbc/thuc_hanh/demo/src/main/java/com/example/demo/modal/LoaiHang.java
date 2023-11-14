package com.example.demo.modal;

public class LoaiHang {
    private int id;
    private String tenLoaiHang;

    public LoaiHang(int id, String tenLoaiHang) {
        this.id = id;
        this.tenLoaiHang = tenLoaiHang;
    }

    public LoaiHang() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }
}
