package case_study.khu_nghi_duong_furama.service;

import java.util.List;

public interface IFuramaService<E> {
    List<E> hienThi();
    void them(E e);
    void sua(E e);
}
