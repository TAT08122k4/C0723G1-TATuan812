package case_study.khu_nghi_duong_furama.view;

import java.util.Scanner;

public class FuramaView {
    Scanner sc = new Scanner(System.in);

    public void runProgramming() {
        int choose ;
        do {
            hienThiMenuChinh();
            try {

               do {
                   System.out.println("Chọn Menu Quản Lý mà bạn muốn");
                   choose = Integer.parseInt(sc.nextLine());
                   switch (choose) {
                       case 1:
                           menuEmployee();
                           break;
                       case 2:
                           menuCustomer();
                           break;
                       case 3:
                           menuFacitity();
                           break;
                       case 4:
                           menuBooking();
                           break;
                       case 5:
                           menuPromotion();
                           break;
                       case 6:
                           System.exit(1);
                           break;
                       default:
                           System.out.println("Vui Lòng Chọn Chức Năng từ 1 -> 6");
                           break;
                   }
               }while (true);
            }catch (Exception e){
                System.err.println("Vui lòng chọn đúng chức năng như ở menu");
            }
        } while (true);
    }

    public void hienThiMenuChinh() {
        System.out.println("==Menu==");
        System.out.println("1.Quản Lý Nhân Viên");
        System.out.println("2.Quản Lý Khách Hàng");
        System.out.println("3.Quản Lý Cơ Sở");
        System.out.println("4.Quản Lý Booking");
        System.out.println("5.Quản lý Khuyến Mãi");
        System.out.println("6.Thoát");
    }

    // cái này và view của nhân viên
    public void menuEmployee() {

        int choose ;

        do {
            try {

            }catch (NumberFormatException e)
            System.out.println("==Quản Lý Nhân viên==");
            System.out.println("1. Hiển Thị Danh Sách Nhân Viên");
            System.out.println("2. Thêm Mới Nhân Viên");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. Xoá Nhân Viên");
            System.out.println("5. Tìm Kiếm Nhân Viên Bằng Tên");
            System.out.println("6. Quay Lại Menu Chính");
            System.out.println("Chọn Chức năng ở quản lý nhân viên");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Danh Sách Sinh Viên");
                    break;
                case 2:
                    System.out.println("Thêm Mới Nhân Viên");
                    break;
                case 3:
                    System.out.println("Sửa Thông tin khách hàng");
                    break;
                case 4:
                    System.out.println("Xoá Nhân Viên");
                    break;
                case 5:
                    System.out.println("Tìm Kiếm nhân viên bằng tên");
                    break;
                case 6:
                    runProgramming();
                    break;
                default:
                    break;
            }
        } while (true);
    }

    // cái này là view của khách hàng
    public void menuCustomer() {
        System.out.println("==Quản Lý Khách Hàng==");
        System.out.println("1. Hiển Thị Danh Sách Khách Hàng");
        System.out.println("2. Thêm Mới Khách Hàng");
        System.out.println("3. Sửa thông tin Khách Hàng");
        System.out.println("4. Xoá Khách Hàng");
        System.out.println("5. Tìm Kiếm Khách Hàng Bằng Tên");
        System.out.println("6. Quay Lại Menu Chính");

    }

    public void menuFacitity() {
        System.out.println("==Quản Lý Cơ Sở==");
        System.out.println("1. Hiển Thị Danh Sách Cơ Sở");
        System.out.println("2. Thêm Mới Cơ Sở");
        System.out.println("3. Hiển Thị Cơ Sở Bảo Trì");
        System.out.println("4. Xoá Cơ Sở");
        System.out.println("6. Quay Lại Menu Chính");
    }

    public void menuBooking() {
        System.out.println("==Quản Lý Booking==");
        System.out.println("1.Thêm Mới Booking ");
        System.out.println("2.Hiển Thị Danh sách Booking");
        System.out.println("3.Tạo Mới Hợp Đồng");
        System.out.println("4.Hiển Thị danh sách hợp đồng");
        System.out.println("5.Sửa hợp đồng");
        System.out.println("6. Quay Lại Menu Chính");

    }

    public void menuPromotion() {
        System.out.println("==Quản Lý Khuyến Mãi==");
        System.out.println("Hiển Thị danh sách khách hàng sử dụng dịch vụ");
        System.out.println("Hiển Thị danh sách khách hàng nhận voucher");
        System.out.println("Quay Lại Menu Chính");
    }
}
