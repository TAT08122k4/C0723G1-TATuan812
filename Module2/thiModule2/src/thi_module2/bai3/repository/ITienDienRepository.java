package thi_module2.bai3.repository;

import thi_module2.bai3.model.TienDien;

import java.util.List;

public interface ITienDienRepository {
    List<TienDien> layDanhSach();
    void them(TienDien tienDien);
}
