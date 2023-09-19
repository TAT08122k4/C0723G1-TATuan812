package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository;


import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeMay;

import java.util.List;

public interface IXeMayRepo extends IRepository<XeMay>{
    @Override
    void them(XeMay xeMay);

    @Override
    boolean xoa(int bienKiemSoat);

    @Override
    List<XeMay> hienThi();

    @Override
    XeMay timKiem(int bienKiemSoat);
}
