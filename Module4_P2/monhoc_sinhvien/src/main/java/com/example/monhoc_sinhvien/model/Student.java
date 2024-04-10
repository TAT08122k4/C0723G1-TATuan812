package com.example.monhoc_sinhvien.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String maSinhVien;
    String tenSinhVien;
    Float diemTrungBinh;
    Date date;
    @OneToMany(mappedBy = "student")
    Set<MonHoc> monHocs;

    public Student() {
    }

    public Student(int id, String maSinhVien, String tenSinhVien, Float diemTrungBinh, Date date, Set<MonHoc> monHocs) {
        this.id = id;
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.diemTrungBinh = diemTrungBinh;
        this.date = date;
        this.monHocs = monHocs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public Float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<MonHoc> getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(Set<MonHoc> monHocs) {
        this.monHocs = monHocs;
    }
}
