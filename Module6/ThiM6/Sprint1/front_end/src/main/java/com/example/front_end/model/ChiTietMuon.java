package com.example.front_end.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ChiTietMuon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int soLuongMuon;
    LocalDate ngayMuon;
    LocalDate ngayTra;
    @ManyToOne
    @JoinColumn(name = "nhanVien_id", referencedColumnName = "id")
    private NhanVien nhanVien;
    @ManyToOne
    @JoinColumn(name = "congCu_id",referencedColumnName = "id")
    private CongCu congCu;

    public ChiTietMuon() {
    }

    public ChiTietMuon(int id, int soLuongMuon, LocalDate ngayMuon, LocalDate ngayTra, NhanVien nhanVien, CongCu congCu) {
        this.id = id;
        this.soLuongMuon = soLuongMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.nhanVien = nhanVien;
        this.congCu = congCu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public CongCu getCongCu() {
        return congCu;
    }

    public void setCongCu(CongCu congCu) {
        this.congCu = congCu;
    }
}
