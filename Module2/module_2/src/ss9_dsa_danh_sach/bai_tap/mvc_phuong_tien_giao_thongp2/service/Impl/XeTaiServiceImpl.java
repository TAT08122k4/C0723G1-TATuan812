package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service.Impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeMay;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeTai;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.IXeMayRepo;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.IXeTaiRepo;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.impl.XeMayRepositoryImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.impl.XeTaiRepositoryImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service.IXeTaiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiServiceImpl implements IXeTaiService {
    List<XeTai> xeTaiList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private static IXeTaiRepo xeTaiRepo = new XeTaiRepositoryImpl();

    @Override
    public List<XeTai> getList() {
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
        int trongTai = Integer.parseInt(sc.nextLine());
        XeTai xeTai = new XeTai(maSanXuat, tenHangSanXuat, quocGia, bienKiemSoat, namSanXuat, noiSanXuat, chuSoHuu, trongTai);
        xeTaiRepo.them(xeTai);
    }

    @Override
    public boolean xoa() {
        System.out.println("Nhập biển số xe bạn muốn xoá:");
        int bienSoXe = Integer.parseInt(sc.nextLine());
        System.out.println("Bạn có chắc chắn muốn xoá không ? (Nhập '1' để xác nhận, '-1' để huỷ) ");
        int xacNhan = Integer.parseInt(sc.nextLine());
        if (xacNhan == 1) {
            xeTaiRepo.xoa(bienSoXe);
        } else {
            System.out.println("Bạn đã huỷ xoá!");
        }
        return false;
    }
    @Override
    public void hienThi() {
        List<XeTai> xeTaiList1 = xeTaiRepo.hienThi();
        for (XeTai xeTai : xeTaiList1) {
            System.out.println(xeTai);
        }
    }

    @Override
    public void timKiem() {
        System.out.println("Nhập Biển số xe bạn cần tìm:");
        int timBienKS = Integer.parseInt(sc.nextLine());
        System.out.println(xeTaiRepo.timKiem(timBienKS));
    }
}
