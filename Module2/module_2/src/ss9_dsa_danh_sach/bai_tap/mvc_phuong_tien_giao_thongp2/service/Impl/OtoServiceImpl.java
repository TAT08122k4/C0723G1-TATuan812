package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service.Impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.Oto;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeMay;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.IOtoRepo;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.IXeMayRepo;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.impl.OtoRepositoryImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.impl.XeMayRepositoryImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service.IOtoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoServiceImpl implements IOtoService {
    List<Oto> otoList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private static IOtoRepo otoRepo = new OtoRepositoryImpl();

    @Override
    public List<Oto> getList() {
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
        System.out.println("Nhập Chỗ Ngồi Của xe máy");
        int choNgoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kiểu xe:");
        String kieuXe = sc.nextLine();
        Oto oto = new Oto(maSanXuat, tenHangSanXuat, quocGia, bienKiemSoat, namSanXuat, noiSanXuat, chuSoHuu, choNgoi,kieuXe);
        otoRepo.them(oto);
    }

    @Override
    public boolean xoa() {
        System.out.println("Nhập biển số xe bạn muốn xoá");
        int bienSoXe = Integer.parseInt(sc.nextLine());
        System.out.println("Bạn có chắc chắn muốn xoá không ? (Nhập '1' để xác nhận, '-1' để huỷ) ");
        int xacNhan = Integer.parseInt(sc.nextLine());
        if (xacNhan == 1) {
            otoRepo.xoa(bienSoXe);
        } else {
            System.out.println("Bạn đã huỷ xoá!");
        }
        return false;
    }
    @Override
    public void hienThi() {
        List<Oto> otoList1 = otoRepo.hienThi();
        for (Oto oto : otoList1) {
            System.out.println(otoList1);
        }
    }

    @Override
    public void timKiem() {
        System.out.println("Nhập Biển số xe bạn cần tìm:");
        int timBienKS = Integer.parseInt(sc.nextLine());
        System.out.println(otoRepo.timKiem(timBienKS));
    }
}
