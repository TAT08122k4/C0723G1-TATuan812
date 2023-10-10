package thi_module2.bai3.view;

import thi_module2.bai3.controller.ITienDienController;
import thi_module2.bai3.controller.Impl.TienDienController;
import thi_module2.bai3.model.TienDien;
import thi_module2.bai3.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class TienDienView {
    ITienDienController tienDienController = new TienDienController();
    Scanner sc = new Scanner(System.in);

    public void runPrograming() {
        int chon = 0;
        do {
            hienThiMenu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    tienDienController.them(themTienDien());
                    break;
                case 2:
                    List<TienDien> tienDiens = tienDienController.layDanhSach();
                    for (TienDien tienDien : tienDiens){
                        System.out.println(tienDien);
                    }
                    break;
                case 3:
                    System.out.println("Bạn Đã Thoát Chương trình");
                    System.exit(1);
                    break;
                default:
                    System.out.println("VUi lòng chọn từ 1->3");
            }
        } while (true);
    }

    public void hienThiMenu() {
        System.out.println("==Menu==");
        System.out.println("1.Thêm Mới Hoá Đơn tiền điện");
        System.out.println("2.Hiển Thị");
        System.out.println("3.Thoát");
        System.out.println("Vui lòng chọn chức năng");
    }

    public TienDien themTienDien() {
        return new TienDien(nhapMaHoaDon(), nhapTen(), nhapLoaiKhach(), nhapMucTieuThu());
    }
    public boolean checkMaHoaDon(String maHoaDon) {
        List<TienDien> tienDiens = tienDienController.layDanhSach();
        for (TienDien tienDien : tienDiens) {
            if (tienDien.getMaHoaDon().equals(maHoaDon)) {
                return true;
            }
        }
        return false;
    }

    public String nhapMaHoaDon() {
        String maHoaDon = null;
        do {
            System.out.println("Nhập Mã Hoá đơn theo định dạng MHD-XXXX");
            maHoaDon = sc.nextLine();
            if (!Regex.kiemTraMaHoaDon(maHoaDon)) {
                System.err.println("Vui lòng nhập đúng định dạng MHD-XXXX");
            }
            if (checkMaHoaDon(maHoaDon)) {
                System.err.println("Mã hoá đơn đã tồn tại");
            }
        } while (!Regex.kiemTraMaHoaDon(maHoaDon) || checkMaHoaDon(maHoaDon));
        return maHoaDon;
    }

    public String nhapTen() {
        System.out.println("Nhập họ và tên của khách hàng");
        String hoTen = sc.nextLine();
        return hoTen;
    }

    public String nhapLoaiKhach() {
        String loaiKhach = null;
        int chon = 0;
        do {
            System.out.println("1.sinh hoạt");
            System.out.println("2.kinh doanh");
            System.out.println("Chọn loại khách");
            chon = Integer.parseInt(sc.nextLine());
            if (chon == 1){
                loaiKhach = "sinh hoạt";
                break;
            }else if (chon == 2){
                loaiKhach = "kinh doanh";
                break;
            }else {
                System.err.println("Vui lòng chọn 1 or 2");
            }
        } while (true);
        return loaiKhach;
    }

    public int nhapMucTieuThu() {
        int mucTieuThu = 0;
        do {
            System.out.println("Vui lòng nhập mức tiêu thụ là số nguyên dương");
            mucTieuThu = Integer.parseInt(sc.nextLine());
            if (mucTieuThu <= 0) {
                System.err.println("Mức tiêu thụ phải nguyên dương");
            } else {
                break;
            }
        } while (true);
        return mucTieuThu;
    }
}
