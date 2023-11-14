package com.example.demo.modal;


import java.sql.Date;

public class HangHoa {
    private int id;
    private String maHangHoa;
    private String tenHangHoa;
    private String don_vi_tinh;
    private LoaiHang loaiHang;
    private Date ngayThuHoach;

    public HangHoa() {
    }

    public HangHoa(int id, String maHangHoa, String tenHangHoa, String don_vi_tinh, LoaiHang loaiHang, Date ngayThuHoach) {
        this.id = id;
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.don_vi_tinh = don_vi_tinh;
        this.loaiHang = loaiHang;
        this.ngayThuHoach = ngayThuHoach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getDon_vi_tinh() {
        return don_vi_tinh;
    }

    public void setDon_vi_tinh(String don_vi_tinh) {
        this.don_vi_tinh = don_vi_tinh;
    }

    public LoaiHang getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(LoaiHang loaiHang) {
        this.loaiHang = loaiHang;
    }

    public Date getNgayThuHoach() {
        return ngayThuHoach;
    }

    public void setNgayThuHoach(Date ngayThuHoach) {
        this.ngayThuHoach = ngayThuHoach;
    }
}
