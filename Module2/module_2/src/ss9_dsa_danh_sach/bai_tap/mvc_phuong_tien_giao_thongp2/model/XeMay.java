package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model;

public class XeMay extends PhuongTienGiaoThong{
     private int congSuat;

    public XeMay() {

    }

    public XeMay(int maHangSanXuat, String tenHangSanXuat, String quocGia, int bienKiemSoat, int namSanXuat, String hangSanXuat, String choSoHuu, int congSuat) {
        super(maHangSanXuat, tenHangSanXuat, quocGia, bienKiemSoat, namSanXuat, hangSanXuat, choSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay(int bienKiemSoat, int namSanXuat, String hangSanXuat, String choSoHuu) {
        super(bienKiemSoat, namSanXuat, hangSanXuat, choSoHuu);
    }

    @Override
    public int getBienKiemSoat() {
        return super.getBienKiemSoat();
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() + "Công Suất: " + this.congSuat;
    }
}
