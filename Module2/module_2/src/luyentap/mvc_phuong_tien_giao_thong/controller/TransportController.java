package luyentap.mvc_phuong_tien_giao_thong.controller;

import luyentap.mvc_phuong_tien_giao_thong.model.Transport;
import luyentap.mvc_phuong_tien_giao_thong.model.XeMay;
import luyentap.mvc_phuong_tien_giao_thong.service.impl.OtoServiceImpl;
import luyentap.mvc_phuong_tien_giao_thong.service.impl.XeMayServiceImpl;
import luyentap.mvc_phuong_tien_giao_thong.service.impl.XeTaiServiceImpl;
import luyentap.mvc_phuong_tien_giao_thong.view.TransportManagerView;

import java.util.List;
import java.util.Scanner;

public class TransportController {
    final Scanner sc = new Scanner(System.in);
    private final TransportManagerView transportManagerView = new TransportManagerView();
    private final XeMayServiceImpl xeMayService = new XeMayServiceImpl();
    private final OtoServiceImpl otoService = new OtoServiceImpl();
    private final XeTaiServiceImpl xeTaiService = new XeTaiServiceImpl();
    private List<luyentap.mvc_phuong_tien_giao_thong.model.XeMay> XeMay;

    public void runPrograming(){
        int chon;
        int chonLoaiXe;
        do {
            transportManagerView.displayMenu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    do {
                        transportManagerView.hienThiLoaiXe();
                        System.out.println("Nhập Loại Xe Bạn Muốn Thêm:");
                        chonLoaiXe = Integer.parseInt(sc.nextLine());
                        switch (chonLoaiXe){
                            case 1:
                               xeMayService.createTransport(transportManagerView.chonHangXeMay());
                                break;


                        }

                    }while (chonLoaiXe > 4 || chonLoaiXe <= 0);
                    break;
                case 2:
                    do {
                        transportManagerView.hienThiLoaiXe();
                        System.out.println("Nhập Loại Xe Bạn Muốn Hiển Thị:");
                        chonLoaiXe = Integer.parseInt(sc.nextLine());
                        switch (chonLoaiXe){
                            case 1:
                                Transport xeMay = new XeMay(12, transportManagerView.chonHangXeMay().getTenHangSanXuat(),12,"t","2s");
                                transportManagerView.hienThiXeMay((List<XeMay>) xeMay);
                                return;
                        }


                    }while (true);
            }

        }while (chon > 5 || chon <= 0);
        runPrograming();
    }
}
