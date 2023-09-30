package case_study.khu_nghi_duong_furama.repository;

import java.util.List;

public interface IFuramaRepo<E> {
    void add(E e);
    List<String> display();
}
