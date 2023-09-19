package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeMay;

import java.util.List;

public interface IXeMay extends IService<XeMay> {
    @Override
    List<XeMay> getList();

    @Override
    void them(XeMay xeMay);

    @Override
    boolean xoa(int bienKiemSoat);

    @Override
    List<XeMay> hienThi();

    @Override
    XeMay timKiem(int bienKiemSoat);
}
