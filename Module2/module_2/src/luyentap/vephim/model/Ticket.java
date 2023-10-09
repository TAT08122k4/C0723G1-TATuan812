package luyentap.vephim.model;

public class Ticket {
    private String maVe;
    private String tenPhim;
    private int gia;
    private String xuatChieu;
    private String ngayChieu;

    public Ticket(){}
    public Ticket(String maVe, String tenPhim, int gia, String xuatChieu, String ngayChieu) {
        this.maVe = maVe;
        this.tenPhim = tenPhim;
        this.gia = gia;
        this.xuatChieu = xuatChieu;
        this.ngayChieu = ngayChieu;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getXuatChieu() {
        return xuatChieu;
    }

    public void setXuatChieu(String xuatChieu) {
        this.xuatChieu = xuatChieu;
    }

    public String getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(String ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "maVe='" + maVe + '\'' +
                ", tenPhim='" + tenPhim + '\'' +
                ", gia=" + gia +
                ", xuatChieu='" + xuatChieu + '\'' +
                ", ngayChieu='" + ngayChieu + '\'' +
                '}';
    }
}
