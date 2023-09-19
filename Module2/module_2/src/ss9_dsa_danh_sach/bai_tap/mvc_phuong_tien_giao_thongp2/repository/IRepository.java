package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository;

import java.util.List;

public interface IRepository<E> {
    void them(E e);
    boolean xoa(int bienKiemSoat);
    List<E> hienThi();
    E timKiem(int bienKiemSoat);
}
