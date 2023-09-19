package luyentap.mvc_phuong_tien_giao_thong.view;

import luyentap.mvc_phuong_tien_giao_thong.model.*;

import java.util.List;
import java.util.Scanner;

public class TransportManagerView {
    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("= = = = =Chương Trình Quản Lý Phương Tiện Giao Thông= = = = =");
        System.out.println("1. Thêm Mới Phương Tiện Giao Thông");
        System.out.println("2. Hiển Thị Các Phương Tiện Giao Thông");
        System.out.println("3. Xoá Phương Tiện Giao Thông");
        System.out.println("4. Tìm Kiếm Phương Tiện Giao Thông");
        System.out.println("5. Trở Lại");
        System.out.println("Hãy Nhập Chức Năng Bạn Muốn Thử");
    }

    public int deleteTransport() {
        System.out.println("Nhập Biển Số Xe Bạn Muốn Xoá: ");
        int xoaXe = Integer.parseInt(sc.nextLine());
        return xoaXe;
    }

    public void hienThiLoaiXe() {
        System.out.println("1.Xe Máy");
        System.out.println("2.Oto");
        System.out.println("3.Xe Tải");
        System.out.println("4.Thoát");


    }

    public int inputBienSoXe(){
        System.out.println("Nhập biển Kiểm soát:");
        return Integer.parseInt(sc.nextLine());
    }
    public int inputYear(){
        System.out.println("Nhập Năm Sản Xuất:");
        return Integer.parseInt(sc.nextLine());
    }
    public String inputChuSoHuu(){
        System.out.println("Nhập Chủ Sở Hữu");
        return sc.nextLine();
    }

    public XeMay chonHangXeMay() {
        HangSanXuat yamaha = new HangSanXuat(001, "Yamaha", "Nhật Bản");
        HangSanXuat sirius = new HangSanXuat(002, "Sirius", "Nhật Bản");
        HangSanXuat vinfast = new HangSanXuat(003, "Yamaha", "Nhật Bản");
        int chon;
        Transport transport = new XeMay();
        String congsuat = sc.nextLine();
        do {
            System.out.println("Chọn Hãng Xe \n " +
                    " 1.Yamaha\n" +
                    "2.Sirius\n" +
                    "3.Vinfast");
            chon = Integer.parseInt(sc.nextLine());
            if (chon < 4 && chon > 0) {
                break;
            }
        } while (chon <= 0 || chon >= 4);
        if (chon == 1) {
            return (XeMay) (transport = new XeMay(inputBienSoXe(),yamaha,inputYear(),inputChuSoHuu(),congsuat));
        } else if (chon == 2) {
            return (XeMay) (transport = new XeMay(inputBienSoXe(),sirius,inputYear(),inputChuSoHuu(),congsuat));
        } else if (chon == 3) {
//            return vinfast;
        } else {
            return null;
        }
        return null;
    }

    public HangSanXuat chonHangOto() {
        HangSanXuat toyota = new HangSanXuat(001, "Toyota", "Nhật Bản");
        HangSanXuat lambo = new HangSanXuat(002, "Lambo", "Ý");
        HangSanXuat vinfast = new HangSanXuat(003, "Vinfast", "Việt Nam");
        int chon;
        HangSanXuat hangSanXuat = new HangSanXuat();
        do {
            System.out.println("Chọn Hãng Xe " +
                    "1.Toyota" +
                    "2.Lambo" +
                    "3.Vinfast");
            chon = Integer.parseInt(sc.nextLine());
            if (chon < 4 && chon > 0) {
                break;
            }
        } while (chon <= 0 || chon >= 4);
        if (chon == 1) {
            return toyota;
        } else if (chon == 2) {
            return lambo;
        } else if (chon == 3) {
            return vinfast;
        } else {
            return null;
        }
    }

    public HangSanXuat chonHangXeTai() {
        HangSanXuat longchen = new HangSanXuat(001, "Longchen", "Trung Quốc");
        HangSanXuat huyndai = new HangSanXuat(002, "Huyndai", "Hàn Quốc");
        HangSanXuat nissan = new HangSanXuat(003, "Nissan", "Nhật Bản");
        int chon;
        HangSanXuat hangSanXuat = new HangSanXuat();
        do {
            System.out.println("Chọn Hãng Xe " +
                    "1.Longchen" +
                    "2.Huyndai" +
                    "3.Nissan");
            chon = Integer.parseInt(sc.nextLine());
            if (chon < 4 && chon > 0) {
                break;
            }
        } while (chon <= 0 || chon >= 4);
        if (chon == 1) {
            return longchen;
        } else if (chon == 2) {
            return huyndai;
        } else if (chon == 3) {
            return nissan;
        } else {
            return null;
        }
    }

    public int xoaXe() {
        System.out.println("Nhập Biển Số xe bạn muốn xoá:");
        return Integer.parseInt(sc.nextLine());
    }

    public int timKiemXe() {
        System.out.println("Nhập Biển số xe bạn muốn tìm kiếm");
        return Integer.parseInt(sc.nextLine());
    }

    public void hienThiXeMay(List<XeMay> xeMays) {
        if (xeMays.size() == 0) {
            System.out.println("Danh Sách Xe Máy rỗng");
        } else {
            for (XeMay xemay : xeMays) {
                System.out.println(xemay);
            }
        }
    }

    public void hienThiOto(List<Oto> otos) {
        if (otos.size() == 0) {
            System.out.println("Danh Sách Oto rỗng");
        } else {
            for (Oto oto : otos
            ) {
                System.out.println(oto);

            }
        }
    }
    public void hienThiXeTai(List<XeTai>xeTais) {
        if (xeTais.size() == 0) {
            System.out.println("Danh Sách Oto rỗng");
        } else {
            for (XeTai xeTai : xeTais
            ) {
                System.out.println(xeTai);
            }
        }
    }
}
