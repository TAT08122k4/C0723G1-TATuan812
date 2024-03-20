package com.example.front_end.model;

import jakarta.persistence.*;

@Entity
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String tenNhanVien;
    @ManyToOne
    @JoinColumn(name = "viTri_id", referencedColumnName = "id")
    private ViTri viTri;

    public NhanVien() {
    }

    public NhanVien(int id, String tenNhanVien, ViTri viTri) {
        this.id = id;
        this.tenNhanVien = tenNhanVien;
        this.viTri = viTri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }
}
