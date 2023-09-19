package luyentap.mvc_phuong_tien_giao_thong.service.impl;

import luyentap.mvc_phuong_tien_giao_thong.model.XeTai;
import luyentap.mvc_phuong_tien_giao_thong.repository.impl.XeTaiRepositoryImpl;

public class XeTaiServiceImpl implements ITransportService<XeTai> {
    private XeTaiRepositoryImpl xeTaiRepository = new XeTaiRepositoryImpl();

    @Override
    public void createTransport(XeTai xeTai) {
        xeTaiRepository.createTransport(xeTai);
    }

    @Override
    public void displayTransport(XeTai xeTai) {
        xeTaiRepository.displayTransport();
    }

    @Override
    public void deleteTransport(int bienSoXe) {
        xeTaiRepository.deleteTransport(bienSoXe);
    }

    @Override
    public void searchTransport(int bienSoXe) {
        xeTaiRepository.searchTransport(bienSoXe);
    }

    @Override
    public void exit() {

    }
}
