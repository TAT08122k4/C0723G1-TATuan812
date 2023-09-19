package luyentap.mvc_phuong_tien_giao_thong.repository.impl;

import java.util.List;

public interface ITransportRepository<E> {
    void createTransport(E transport);

    List<E> displayTransport();

    void deleteTransport(int bienSoXe);

    E searchTransport(int bienSoXe);

}
