package thi_module2.bai3.model;

public class TienDien {
    String maHoaDon;
    String hoTen;
    String loaiKhachHang;
    int mucTieuThu;
    public TienDien(){}

    public TienDien(String maHoaDon, String hoTen, String loaiKhachHang, int mucTieuThu) {
        this.maHoaDon = maHoaDon;
        this.hoTen = hoTen;
        this.loaiKhachHang = loaiKhachHang;
        this.mucTieuThu = mucTieuThu;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public int getMucTieuThu() {
        return mucTieuThu;
    }

    public void setMucTieuThu(int mucTieuThu) {
        this.mucTieuThu = mucTieuThu;
    }
    public int tongTienHoaDon(int mucTieuThu){
        return this.mucTieuThu * 2500;

    }

    @Override
    public String toString() {
        return "TienDien{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", loaiKhachHang='" + loaiKhachHang + '\'' +
                ", mucTieuThu=" + mucTieuThu +
                ", Tổng Tiền Hoá Đơn=" + tongTienHoaDon(this.mucTieuThu) +
                '}';
    }

}
