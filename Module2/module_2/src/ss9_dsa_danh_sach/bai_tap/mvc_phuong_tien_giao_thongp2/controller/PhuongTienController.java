package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.controller;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeMay;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeTai;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service.Impl.OtoServiceImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service.Impl.XeMayServiceImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service.Impl.XeTaiServiceImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.view.impl.PhuongTienGiaoThongView;

import java.util.Scanner;

public class PhuongTienController {
    private static PhuongTienGiaoThongView phuongTienGiaoThongView = new PhuongTienGiaoThongView();
    private static XeMayServiceImpl xeMayService = new XeMayServiceImpl();
    private static OtoServiceImpl otoService = new OtoServiceImpl();
    private static XeTaiServiceImpl xeTaiService = new XeTaiServiceImpl();

    public void runPrograming() {
        Scanner sc = new Scanner(System.in);
        int chonPhuongTien;
        do {
            phuongTienGiaoThongView.hienThiMenu();
            switch (phuongTienGiaoThongView.nhapChon()) {
                case 1:
                    phuongTienGiaoThongView.themPhuongTien();
                    chonPhuongTien = Integer.parseInt(sc.nextLine());
                    switch (chonPhuongTien) {
                        case 1:
                            xeMayService.them();
                            break;
                        case 2:
                            otoService.them();
                            break;
                        case 3:
                            xeMayService.them();
                            break;
                        default:
                            System.out.println("chỉ nhập từ 1 -> 3");
                    }
                    break;
                case 2:
                    phuongTienGiaoThongView.hienThiPhuongTien();
                    chonPhuongTien = Integer.parseInt(sc.nextLine());
                    switch (chonPhuongTien) {
                        case 1:
                            xeMayService.hienThi();
                            break;
                        case 2:
                            otoService.hienThi();
                            break;
                        case 3:
                            xeTaiService.hienThi();
                            break;
                        default:
                            System.out.println(" chỉ nhập 1 -> 3");
                    }
                    break;
                case 3:
                    phuongTienGiaoThongView.xoaPhuongTien();
                    chonPhuongTien = Integer.parseInt(sc.nextLine());
                    switch (chonPhuongTien) {
                        case 1:
                            xeMayService.xoa();
                            break;
                        case 2:
                            otoService.xoa();
                            break;
                        case 3:
                            xeTaiService.xoa();
                            break;
                        default:
                            System.out.println(" chỉ nhập 1 -> 3");
                    }
                    break;
                case 4:
                    phuongTienGiaoThongView.timKiemPhuongTien();
                    chonPhuongTien = Integer.parseInt(sc.nextLine());
                    switch (chonPhuongTien) {
                        case 1:
                            xeMayService.timKiem();
                            break;
                        case 2:
                            otoService.timKiem();
                            break;
                        case 3:
                            xeTaiService.timKiem();
                            break;
                        default:
                            System.out.println(" chỉ nhập 1 -> 3");
                    }
                    break;
                default:
                    System.exit(0);

            }
        } while (true);
    }
}
