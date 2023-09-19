package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.Oto;

import java.util.List;

public interface IOtoRepo extends IRepository<Oto>{
    @Override
    void them(Oto oto);

    @Override
    boolean xoa(int bienKiemSoat);

    @Override
    List<Oto> hienThi();

    @Override
    Oto timKiem(int bienKiemSoat);
}
