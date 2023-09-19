package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeTai;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.IXeTaiRepo;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepositoryImpl implements IXeTaiRepo {
    private static List<XeTai> xeTaiList = new ArrayList<>();

    static {
        xeTaiList.add(new XeTai(1, "Nissan", "Nhật", 7777, 2013, "Nissan", "Toại", 220));
        xeTaiList.add(new XeTai(2, "Longchen", "Trung Quốc", 6666, 2012, "Longchen", "Hiếu", 210));
    }


    @Override
    public void them(XeTai xeTai) {
        xeTaiList.add(xeTai);
    }

    @Override
    public boolean xoa(int bienKiemSoat) {
        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienKiemSoat() == bienKiemSoat) {
                xeTaiList.remove(xeTai);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<XeTai> hienThi() {
        return xeTaiList;
    }

    @Override
    public XeTai timKiem(int bienKiemSoat) {
        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienKiemSoat() == bienKiemSoat) {
                return xeTai;
            }
        }
        return null;
    }
}
