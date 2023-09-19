package luyentap.mvc_phuong_tien_giao_thong.service.impl;

import luyentap.mvc_phuong_tien_giao_thong.model.Transport;
import luyentap.mvc_phuong_tien_giao_thong.repository.impl.ITransportRepository;
import luyentap.mvc_phuong_tien_giao_thong.repository.impl.TransportRepositoryImpl;

public class TransportServiceImpl implements ITransportService<E>{
    private final ITransportRepository trasportRepository = new TransportRepositoryImpl() {
    };
    @Override
    public void createTransport(E transport) {
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
