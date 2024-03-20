package com.example.front_end.model;

import jakarta.persistence.*;

@Entity
public class CongCu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String tenCongCu;
    String donVi;
    int soLuong;
    @ManyToOne
    @JoinColumn(name = "hangSanXuat_id", referencedColumnName = "id")
    private HangSanXuat hangSanXuat;

    public CongCu() {
    }

    public CongCu(int id, String tenCongCu, String donVi, int soLuong, HangSanXuat hangSanXuat) {
        this.id = id;
        this.tenCongCu = tenCongCu;
        this.donVi = donVi;
        this.soLuong = soLuong;
        this.hangSanXuat = hangSanXuat;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenCongCu() {
        return tenCongCu;
    }

    public void setTenCongCu(String tenCongCu) {
        this.tenCongCu = tenCongCu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
}
