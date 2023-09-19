package luyentap.mvc_phuong_tien_giao_thong.service.impl;

import luyentap.mvc_phuong_tien_giao_thong.model.Oto;
import luyentap.mvc_phuong_tien_giao_thong.repository.impl.OtoRepositoryImpl;

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
