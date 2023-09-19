package luyentap.mvc_phuong_tien_giao_thong.model;

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
}
