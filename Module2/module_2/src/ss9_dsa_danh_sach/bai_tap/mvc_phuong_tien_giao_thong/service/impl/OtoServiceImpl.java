package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.service.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.model.Oto;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.repository.impl.OtoRepositoryImpl;

import java.awt.*;

public class OtoServiceImpl implements ITransportService<Oto>{
    private OtoRepositoryImpl otoRepository = new OtoRepositoryImpl();
    @Override
    public void createTransport(Oto oto) {
        otoRepository.createTransport(oto);
    }

    @Override
    public void displayTransport(Oto oto) {
otoRepository.displayTransport();
    }

    @Override
    public void deleteTransport(int bienSoXe) {
otoRepository.deleteTransport(bienSoXe);
    }

    @Override
    public void searchTransport(int bienSoXe) {
otoRepository.searchTransport(bienSoXe);
    }

    @Override
    public void exit() {
    }
}
