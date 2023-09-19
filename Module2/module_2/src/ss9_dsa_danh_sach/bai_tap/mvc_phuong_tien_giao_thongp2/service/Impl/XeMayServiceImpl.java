package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service.Impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeMay;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.IXeMayRepo;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.impl.XeMayRepositoryImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service.IXeMayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayServiceImpl implements IXeMayService {
    List<XeMay> xeMayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private static IXeMayRepo xeMayRepository = new XeMayRepositoryImpl();

    @Override
    public List<XeMay> getList() {
        return null;
    }

    @Override
    public void them() {
        System.out.println("Nhập biển kiểm soát:");
        int bienKiemSoat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mã hãng sản xuất");
        int maSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Tên hãng sản xuất");
        String tenHangSanXuat = sc.nextLine();
        System.out.println("Quốc Gia");
        String quocGia = sc.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên nơi sản xuất");
        String noiSanXuat = sc.nextLine();
        System.out.println("Nhập Chủ Sỡ Hữu");
        String chuSoHuu = sc.nextLine();
        System.out.println("Nhập Công Suất Của xe máy");
        int congSuat = Integer.parseInt(sc.nextLine());
        XeMay xeMay = new XeMay(maSanXuat, tenHangSanXuat, quocGia, bienKiemSoat, namSanXuat, noiSanXuat, chuSoHuu, congSuat);
        xeMayRepository.them(xeMay);
    }

    @Override
    public boolean xoa() {
        System.out.println("Nhập biển số xe bạn muốn xoá");
        int bienSoXe = Integer.parseInt(sc.nextLine());
        System.out.println("Bạn có chắc chắn muốn xoá không ? (Nhập '1' để xác nhận, '-1' để huỷ) ");
        int xacNhan = Integer.parseInt(sc.nextLine());
        if (xacNhan == 1) {
            xeMayRepository.xoa(bienSoXe);
        } else {
            System.out.println("Bạn đã huỷ xoá!");
        }
        return false;
    }
    @Override
    public void hienThi() {
        List<XeMay> xeMayList = xeMayRepository.hienThi();
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay);
        }
    }

    @Override
    public void timKiem() {
        System.out.println("Nhập Biển số xe bạn cần tìm:");
        int timBienKS = Integer.parseInt(sc.nextLine());
        System.out.println(xeMayRepository.timKiem(timBienKS));
    }
}
