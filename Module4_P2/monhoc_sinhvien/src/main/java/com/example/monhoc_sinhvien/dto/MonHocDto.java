package com.example.monhoc_sinhvien.dto;

import com.example.monhoc_sinhvien.model.Student;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class MonHocDto {
    int id;
    @NotBlank(message = "Không được để trống")
    String tenMonHoc;
    @Min(value = 0,message = "Điểm số phải lớn hơn or bằng 0 ")
    @Max(value = 10,message = "Điểm số bé hơn or bằng 10")
    String soDiem;
    private Student student;

    public MonHocDto() {
    }

    public MonHocDto(int id, String tenMonHoc, String soDiem, Student student) {
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
