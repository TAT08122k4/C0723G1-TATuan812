package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeMay;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.IXeMayRepo;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepositoryImpl implements IXeMayRepo {
    private static List<XeMay> xeMayList = new ArrayList<>();

    static {
        xeMayList.add(new XeMay(1, "Bu Gà Ti", "Ý", 9999, 2013, "Lam Bò", "Kiệt", 220));
        xeMayList.add(new XeMay(2, "Suzuki", "Nhật Bản", 8888, 2014, "Toyota", "Minh Tuấn", 150));
    }

    @Override
    public void them(XeMay xeMay) {
        xeMayList.add(xeMay);
    }

    @Override
    public boolean xoa(int bienKiemSoat) {
        for (XeMay xeMay1 : xeMayList) {
            if (xeMay1.getBienKiemSoat() == bienKiemSoat) {
                xeMayList.remove(xeMay1);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<XeMay> hienThi() {
         return xeMayList;
    }

    @Override
    public XeMay timKiem(int bienKiemSoat) {
       for (XeMay xeMay1:xeMayList){
           if (xeMay1.getBienKiemSoat() == bienKiemSoat ){
               return xeMay1;
           }else {
               System.out.println("Không tìm thấy");
           }
       }
       return null;
    }
}
