package com.example.monhoc_sinhvien.model;

import jakarta.persistence.*;

@Entity
public class MonHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String tenMonHoc;
    String soDiem;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public MonHoc() {
    }

    public MonHoc(int id, String tenMonHoc, String soDiem, Student student) {
        this.id = id;
        this.tenMonHoc = tenMonHoc;
        this.soDiem = soDiem;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getSoDiem() {
        return soDiem;
    }

    public void setSoDiem(String soDiem) {
        this.soDiem = soDiem;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
