package thi_module2.bai3.service;

import thi_module2.bai3.model.TienDien;

import java.util.List;

public interface ITienDienService {
    List<TienDien> layDanhSach();
    void them(TienDien tienDien);
}
