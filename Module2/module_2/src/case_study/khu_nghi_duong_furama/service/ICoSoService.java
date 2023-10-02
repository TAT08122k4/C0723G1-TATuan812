package case_study.khu_nghi_duong_furama.service;

import case_study.khu_nghi_duong_furama.model.facility.Furama;

import java.util.List;

public interface ICoSoService extends IFuramaService<Furama> {
    @Override
    List<Furama> display();

    @Override
    void add(Furama furama);

    @Override
    void edit(Furama furama);
    List<Furama> hienBaoTri();
}
