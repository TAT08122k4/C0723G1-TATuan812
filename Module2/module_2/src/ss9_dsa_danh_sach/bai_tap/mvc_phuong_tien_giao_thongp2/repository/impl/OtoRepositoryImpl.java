package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.model.Oto;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.repository.IOtoRepo;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thongp2.service.IOtoService;

import java.util.ArrayList;
import java.util.List;

public class OtoRepositoryImpl implements IOtoRepo {
    private static List<Oto> otoList = new ArrayList<>();

    static {
        otoList.add(new Oto(1, "Bu Gà Ti", "Ý", 9999, 2013, "Lam Bò", "Kiệt", 4, "sieu xe"));
        otoList.add(new Oto(2, "Lam Bò", "Ý", 1111, 2013, "Lam Bò", "Kiệt", 4, "sieu xe"));
    }


    @Override
    public void them(Oto oto) {
        otoList.add(oto);
    }

    @Override
    public boolean xoa(int bienKiemSoat) {
        for (Oto oto : otoList) {
            if (oto.getBienKiemSoat() == bienKiemSoat) {
                otoList.remove(oto);
                return true;
            }
            return false;

        }
        return false;
    }

    @Override
    public List<Oto> hienThi() {
        return otoList;
    }

    @Override
    public Oto timKiem(int bienKiemSoat) {
        for (Oto oto:otoList){
            if (oto.getBienKiemSoat() == bienKiemSoat){
                return oto;
            }
        }
        return null;
    }
}
