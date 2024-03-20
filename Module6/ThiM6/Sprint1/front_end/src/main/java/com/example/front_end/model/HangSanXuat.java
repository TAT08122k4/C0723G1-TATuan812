package com.example.front_end.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HangSanXuat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String tenHangSanXuat;

    public HangSanXuat() {
    }

    public HangSanXuat(int id, String tenHangSanXuat) {
        this.id = id;
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }
}
