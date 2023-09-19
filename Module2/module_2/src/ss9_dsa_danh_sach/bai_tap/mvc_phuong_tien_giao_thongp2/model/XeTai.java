package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model;

public class XeTai extends PhuongTienGiaoThong{
    private int trongTai;

    public XeTai() {

    }
    public XeTai(int maHangSanXuat, String tenHangSanXuat, String quocGia, int bienKiemSoat, int namSanXuat, String hangSanXuat, String choSoHuu, int trongTai) {
        super(maHangSanXuat, tenHangSanXuat, quocGia, bienKiemSoat, namSanXuat, hangSanXuat, choSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                '}';
    }
}
