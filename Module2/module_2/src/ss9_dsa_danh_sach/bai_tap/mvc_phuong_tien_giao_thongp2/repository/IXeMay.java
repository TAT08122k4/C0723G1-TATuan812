package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository;


import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeMay;

import java.util.List;

public interface IXeMay extends IRepository<XeMay>{
    @Override
    List<XeMay> getList();

    @Override
    void them(XeMay xeMay);

    @Override
    boolean xoa(int bienKiemSoat);

    @Override
    List<XeMay> hienThi(XeMay xeMay);

    @Override
    XeMay timKiem(int bienKiemSoat);
}
