package luyentap.mvc_phuong_tien_giao_thong.model;

public class XeTai extends Transport{
    private int trongTai;

    public XeTai(int bienKiemSoat, HangSanXuat tenHangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
}
