package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service;

import java.util.List;

public interface IService<E>{
    List<E> getList();
    void them();
    boolean xoa();
    void hienThi();
    void timKiem();
}
