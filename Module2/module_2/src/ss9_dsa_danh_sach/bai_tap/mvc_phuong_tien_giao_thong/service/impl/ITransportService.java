package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.service.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.model.Transport;

public interface ITransportService<E> {
    void createTransport(E e);
    void displayTransport(E e);
    void deleteTransport(int bienSoXe);
    void searchTransport(int bienSoXe);
    void exit();
}
