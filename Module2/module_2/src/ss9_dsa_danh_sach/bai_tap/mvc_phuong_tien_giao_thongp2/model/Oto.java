package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model;

public class Oto extends PhuongTienGiaoThong{
    private int soChoNgoi;
    private String kieuXe;

    public Oto(int maHangSanXuat, String tenHangSanXuat, String quocGia, int bienKiemSoat, int namSanXuat, String hangSanXuat, String choSoHuu, int soChoNgoi, String kieuXe) {
        super(maHangSanXuat, tenHangSanXuat, quocGia, bienKiemSoat, namSanXuat, hangSanXuat, choSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }
}
