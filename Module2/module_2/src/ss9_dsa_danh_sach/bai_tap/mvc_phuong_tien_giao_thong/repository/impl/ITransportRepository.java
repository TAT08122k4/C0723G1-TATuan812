package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.repository.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.model.Transport;

import java.util.ArrayList;
import java.util.List;

public interface ITransportRepository<E> {
    void createTransport(E transport);

    List<E> displayTransport();

    void deleteTransport(int bienSoXe);

    E searchTransport(int bienSoXe);

}
