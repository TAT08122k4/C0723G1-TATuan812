package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.XeTai;

import java.util.List;

public interface IXeTaiService extends IService<XeTai>{
    @Override
    List<XeTai> getList();

    @Override
    void them();

    @Override
    boolean xoa();

    @Override
    void hienThi();

    @Override
    void timKiem();
}
