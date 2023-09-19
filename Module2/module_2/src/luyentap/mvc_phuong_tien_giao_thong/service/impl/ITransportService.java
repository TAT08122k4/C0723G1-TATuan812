package luyentap.mvc_phuong_tien_giao_thong.service.impl;

public interface ITransportService<E> {
    void createTransport(E e);
    void displayTransport(E e);
    void deleteTransport(int bienSoXe);
    void searchTransport(int bienSoXe);
    void exit();
}
