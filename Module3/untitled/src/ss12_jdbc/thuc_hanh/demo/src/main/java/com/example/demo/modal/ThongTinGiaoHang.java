package com.example.demo.modal;

public class ThongTinGiaoHang {
    private int id;
    private String tenNhanVien;
    private String maHoaDon;
    private String tenKhachHang;
    private String diaChiKhachHang;
    private String soDienThoai;
    private String danhSachHangHoa;
    private String hinhThucVanChuyen;

    public ThongTinGiaoHang() {
    }


    public ThongTinGiaoHang(int id, String tenNhanVien, String maHoaDon, String tenKhachHang, String diaChiKhachHang, String soDienThoai, String danhSachHangHoa, String hinhThucVanChuyen) {
        this.id = id;
        this.tenNhanVien = tenNhanVien;
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.diaChiKhachHang = diaChiKhachHang;
        this.soDienThoai = soDienThoai;
        this.danhSachHangHoa = danhSachHangHoa;
        this.hinhThucVanChuyen = hinhThucVanChuyen;
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

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChiKhachHang() {
        return diaChiKhachHang;
    }

    public void setDiaChiKhachHang(String diaChiKhachHang) {
        this.diaChiKhachHang = diaChiKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDanhSachHangHoa() {
        return danhSachHangHoa;
    }

    public void setDanhSachHangHoa(String danhSachHangHoa) {
        this.danhSachHangHoa = danhSachHangHoa;
    }

    public String getHinhThucVanChuyen() {
        return hinhThucVanChuyen;
    }

    public void setHinhThucVanChuyen(String hinhThucVanChuyen) {
        this.hinhThucVanChuyen = hinhThucVanChuyen;
    }
}
