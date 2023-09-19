package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeMay;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeTai;

import java.util.List;

public interface IXeTai extends IService<XeTai>{
    @Override
    List<XeTai> getList();

    @Override
    void them(XeTai xeTai);

    @Override
    boolean xoa(int bienKiemSoat);

    @Override
    List<XeTai> hienThi();

    @Override
    XeTai timKiem(int bienKiemSoat);
}
