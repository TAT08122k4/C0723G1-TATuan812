package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.view.impl;

import com.sun.xml.internal.ws.model.wsdl.WSDLPortProperties;

import java.util.Scanner;

public class PhuongTienGiaoThongView {
    Scanner sc = new Scanner(System.in);
    public int nhapChon(){
        int chon = Integer.parseInt(sc.nextLine());
        do {
           switch (chon){
               case 1:
                   return 1;
               case 2:
                   return 2;
               case 3:
                   return 3;
               case 4:
                   return 4;
               case 5:
                   return 5;
               default:
                   System.out.println("Hãy nhập từ 1->5 vui lòng nhập lại:");
           }
        }while (true);
    }
    public void hienThiMenu() {
        System.out.println("===CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG===");
        System.out.println("Chọn chức năng : ");
        System.out.println("1. Thêm mới phương tiện");
        System.out.println("2. Hiển thị phương tiện");
        System.out.println("3. Xóa phương tiện");
        System.out.println("4. Tìm kiếm theo biển kiểm soát");
        System.out.println("5. Thoát");
        System.out.println("Mời chọn chức năng : ");
    }
    public void themPhuongTien(){
        System.out.println("===Thêm Loại Phương Tiện Nào===");
        System.out.println("Chọn phương tiện bạn muốn thêm : ");
        System.out.println("1. Thêm Xe Máy");
        System.out.println("2. Thêm Oto");
        System.out.println("3. Thêm Xe Tải");
        System.out.println("4. Trở Về Menu Chính");
        System.out.println("Mời chọn : ");
    }
    public void xoaPhuongTien(){
        System.out.println("===Xoá Loại Phương Tiện Nào===");
        System.out.println("Chọn phương tiện bạn muốn thêm : ");
        System.out.println("1. Xoá Xe Máy");
        System.out.println("2. Xoá Oto");
        System.out.println("3. Xoá Xe Tải");
        System.out.println("4. Trở Về Menu Chính");
        System.out.println("Mời bạn chọn : ");
    }
    public void hienThiPhuongTien(){
        System.out.println("===Hiển thị Loại Phương Tiện Nào===");
        System.out.println("Chọn phương tiện bạn muốn hiển thị : ");
        System.out.println("1. Xe Máy");
        System.out.println("2. Oto");
        System.out.println("3. Xe Tải");
        System.out.println("4. Trở Về Menu Chính");
        System.out.println("Mời chọn : ");
    }
    public void timKiemPhuongTien(){
        System.out.println("===Tìm Kiếm Loại Phương Tiện Nào===");
        System.out.println("Chọn phương tiện bạn muốn thêm : ");
        System.out.println("1.  Xe Máy");
        System.out.println("2.  Oto");
        System.out.println("3.  Xe Tải");
        System.out.println("4. Trở Về Menu Chính");
        System.out.println("Mời chọn chức năng : ");
    }
}
