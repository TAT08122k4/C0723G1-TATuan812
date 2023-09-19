package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeMay;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.IXeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepositoryImpl implements IXeMay {
    private static List<XeMay> xeMayList = new ArrayList<>();
    static {
        xeMayList.add(new XeMay(1,"Bu Gà Ti","Ý",9999,2013,"Lam Bò","Kiệt",220));
        xeMayList.add(new XeMay(2,"Suzuki","Nhật Bản",8888,2014,"Toyota","Minh Tuấn",150));
    }
    @Override
    public List<XeMay> getList() {
        return null;
    }

    @Override
    public void them(XeMay xeMay) {
    xeMayList.add(xeMay);
    }

    @Override
    public Boolean xoa(int bienKiemSoat) {
   for (XeMay xeMay1: xeMayList){
       if (xeMay1.getBienKiemSoat() == x)
   }
    }

    @Override
    public List<XeMay> hienThi(XeMay xeMay) {

    }

    @Override
    public XeMay timKiem(XeMay xeMay) {

    }
}
