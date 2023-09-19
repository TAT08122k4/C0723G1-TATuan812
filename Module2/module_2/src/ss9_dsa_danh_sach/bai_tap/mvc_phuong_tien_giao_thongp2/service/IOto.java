package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.Oto;
import java.util.List;

public interface IOto extends IService<Oto>{
    @Override
    List<Oto> getList();

    @Override
    void them(Oto oto);

    @Override
    void xoa(Oto oto);

    @Override
    void hienThi(Oto oto);

    @Override
    void timKiem(Oto oto);
}
