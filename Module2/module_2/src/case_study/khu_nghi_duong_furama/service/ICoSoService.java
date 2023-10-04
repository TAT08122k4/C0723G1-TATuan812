package case_study.khu_nghi_duong_furama.service;

import case_study.khu_nghi_duong_furama.model.facility.Facility;

import java.util.List;

public interface ICoSoService extends IFuramaService<Facility> {
    @Override
    List<Facility> display();

    @Override
    void add(Facility furama);

    @Override
    void edit(Facility furama);
    List<Facility> hienBaoTri();
}
