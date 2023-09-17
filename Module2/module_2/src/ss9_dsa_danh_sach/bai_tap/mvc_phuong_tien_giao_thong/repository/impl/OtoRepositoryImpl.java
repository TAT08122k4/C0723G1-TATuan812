package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.repository.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.model.Oto;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.model.XeMay;

import java.util.ArrayList;
import java.util.List;

public class OtoRepositoryImpl implements ITransportRepository<Oto>{
    private final List<Oto> otoList = new ArrayList<>();
    @Override
    public void createTransport(Oto oto) {
        otoList.add((oto));
    }
    @Override
    public List<Oto> displayTransport() {
        return otoList;
    }

    @Override
    public void deleteTransport(int bienSoXe) {
        for (int i = 0; i < otoList.size(); i++) {
            if (otoList.get(i).equals(bienSoXe)) {
                otoList.remove(i);
                break;
            }else {
                System.out.println("Không tìm thấy xe bạn muốn xoá");
            }
        }

    }
    @Override
    public Oto searchTransport(int bienSoXe) {
        for (int i = 0; i < otoList.size(); i++) {
            if (otoList.get(i).equals(bienSoXe)){
                return otoList.get(i);
            }
        }
        return null;
    }
}
