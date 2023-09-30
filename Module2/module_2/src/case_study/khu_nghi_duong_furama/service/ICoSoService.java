package case_study.khu_nghi_duong_furama.service;

import case_study.khu_nghi_duong_furama.model.facility.Furama;

import java.util.List;

public interface ICoSoService extends IFuramaService<Furama> {
    @Override
    List<Furama> hienThi();

    @Override
    void them(Furama furama);

    @Override
    void sua(Furama furama);
    List<Furama> hienBaoTri();
}
