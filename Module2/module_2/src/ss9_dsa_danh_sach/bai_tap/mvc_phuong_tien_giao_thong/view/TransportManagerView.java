package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.view;

import java.util.Scanner;

public class TransportManagerView {
    Scanner sc = new Scanner(System.in);
    public void displayMenu(){
        System.out.println("= = = = =Chương Trình Quản Lý Phương Tiện Giao Thông= = = = =");
        System.out.println("1. Thêm Mới Phương Tiện Giao Thông");
        System.out.println("2. Hiển Thị Các Phương Tiện Giao Thông");
        System.out.println("3. Xoá Phương Tiện Giao Thông");
        System.out.println("4. Tìm Kiếm Phương Tiện Giao Thông");
        System.out.println("5. Trở Lại");
        System.out.println("Hãy Nhập Chức Năng Bạn Muốn Thử");
    }
    public int deleteTransport(){
        System.out.println("Nhập Biển Số Xe Bạn Muốn Xoá: ");
        int xoaXe = Integer.parseInt(sc.nextLine());
        return xoaXe;
    }
}
