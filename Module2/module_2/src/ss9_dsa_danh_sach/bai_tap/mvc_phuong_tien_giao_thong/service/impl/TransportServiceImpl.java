package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.service.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.model.Transport;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.repository.impl.ITransportRepository;
import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.repository.impl.TransportRepositoryImpl;

import java.util.Scanner;

public class TransportServiceImpl implements ITransportService<Transport>{
    private final ITransportRepository trasportRepository = new TransportRepositoryImpl() {
    };
    @Override
    public void createTransport(Transport transport) {
        trasportRepository.createTransport(transport);
    }

    @Override
    public void displayTransport(Transport transport) {
   trasportRepository.displayTransport();
    }

    @Override
    public void deleteTransport(int bienSoXe) {
        trasportRepository.deleteTransport(bienSoXe);
    }

    @Override
    public void searchTransport(int bienSoXe) {
  trasportRepository.deleteTransport(bienSoXe);
    }

    @Override
    public void exit() {

    }
}
