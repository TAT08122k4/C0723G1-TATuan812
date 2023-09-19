package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model;

public abstract class PhuongTienGiaoThong extends HangSanXuat {
    private int bienKiemSoat;
    private int namSanXuat;
    private String hangSanXuat;
    private String choSoHuu;
    public PhuongTienGiaoThong(){

    }

    public PhuongTienGiaoThong(int bienKiemSoat, int namSanXuat, String hangSanXuat, String choSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.choSoHuu = choSoHuu;
    }


    public PhuongTienGiaoThong(int maHangSanXuat, String tenHangSanXuat, String quocGia, int bienKiemSoat, int namSanXuat, String hangSanXuat, String choSoHuu) {
        super(maHangSanXuat, tenHangSanXuat, quocGia);
        this.bienKiemSoat = bienKiemSoat;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.choSoHuu = choSoHuu;
    }

    public int getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(int bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getChoSoHuu() {
        return choSoHuu;
    }

    public void setChoSoHuu(String choSoHuu) {
        this.choSoHuu = choSoHuu;
    }

    @Override
    public String toString() {
        return "PhuongTienGiaoThong{" +
                "bienKiemSoat=" + bienKiemSoat +
                ", namSanXuat=" + namSanXuat +
                ", hangSanXuat=" + hangSanXuat +
                ", choSoHuu='" + choSoHuu + '\'' +
                '}';
    }
}
