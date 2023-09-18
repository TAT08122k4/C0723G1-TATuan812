package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.model;

public class XeMay extends Transport{
    private String congSuat;

    public XeMay(int bienKiemSoat, HangSanXuat tenHangSanXuat, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }
}
