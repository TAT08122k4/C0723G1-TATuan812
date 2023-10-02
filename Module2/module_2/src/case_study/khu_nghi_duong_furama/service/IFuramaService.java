package case_study.khu_nghi_duong_furama.service;

import java.util.List;

public interface IFuramaService<E> {
    List<E> display();
    void add(E e);
    void edit(E e);
}
