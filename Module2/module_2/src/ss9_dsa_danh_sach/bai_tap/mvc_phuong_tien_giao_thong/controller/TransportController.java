package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.controller;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.service.impl.OtoServiceImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.service.impl.XeMayServiceImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.service.impl.XeTaiServiceImpl;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.view.TransportManagerView;

import java.util.Scanner;

public class TransportController {
    final Scanner sc = new Scanner(System.in);
    private final TransportManagerView transportManagerView = new TransportManagerView();
    private final XeMayServiceImpl xeMayService = new XeMayServiceImpl();
    private final OtoServiceImpl otoService = new OtoServiceImpl();
    private final XeTaiServiceImpl xeTaiService = new XeTaiServiceImpl();

    public void runPrograming(){
        int chon = Integer.parseInt(sc.nextLine());
        int chonLoaiXe;
        do {
            transportManagerView.displayMenu();
            switch (chon){
                case 1:
                    do {
                        System.out.println("Nhập Hãng Xe:");
                        chonLoaiXe = Integer.parseInt(sc.nextLine());
                        switch (chonLoaiXe){
                            case 1:
                                xeMayService.createTransport(transportManagerView.hienThiXeMay());
                                break;
                            case 2:
                                
                        }

                    }while (chonLoaiXe >= 5 || chonLoaiXe <= 0);
            }

        }while (chon > 5 || chon <= 0);
    }
}
