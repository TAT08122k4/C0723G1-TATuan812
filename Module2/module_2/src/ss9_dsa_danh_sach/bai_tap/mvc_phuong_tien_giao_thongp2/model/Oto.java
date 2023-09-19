package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model;

public class Oto extends PhuongTienGiaoThong{
    private int soChoNgoi;
    private String kieuXe;

    public Oto() {
        super();
    }

    @Override
    public int getBienKiemSoat() {
        return super.getBienKiemSoat();
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public Oto(int maHangSanXuat, String tenHangSanXuat, String quocGia, int bienKiemSoat, int namSanXuat, String hangSanXuat, String choSoHuu, int soChoNgoi, String kieuXe) {
        super(maHangSanXuat, tenHangSanXuat, quocGia, bienKiemSoat, namSanXuat, hangSanXuat, choSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }
    @Override
    public String toString() {
        return super.toString() + "Số Chỗ Ngồi: " + this.soChoNgoi + " Kiểu Xe: " + this.kieuXe;
    }
}
