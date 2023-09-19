package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model;

public class HangSanXuat {
    private int maHangSanXuat;
    private String tenHangSanXuat;
    private String quocGia;

    public HangSanXuat(){

    }
    public HangSanXuat(int maHangSanXuat, String tenHangSanXuat, String quocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }

    public int getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(int maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "maHangSanXuat=" + maHangSanXuat +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }
}
