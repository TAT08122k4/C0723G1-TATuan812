package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.service.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.model.XeMay;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.repository.impl.XeMayRepository;

public class XeMayServiceImpl implements ITransportService<XeMay> {
    private final XeMayRepository xeMayRepository = new XeMayRepository();

    @Override
    public void createTransport(XeMay xeMay) {
   xeMayRepository.createTransport(xeMay);
    }

    @Override
    public void displayTransport(XeMay xeMay) {
        xeMayRepository.displayTransport();

    }

    @Override
    public void deleteTransport(int bienSoXe) {
  xeMayRepository.deleteTransport(bienSoXe);
    }

    @Override
    public void searchTransport(int bienSoXe) {
xeMayRepository.searchTransport(bienSoXe);
    }

    @Override
    public void exit() {

    }
}
