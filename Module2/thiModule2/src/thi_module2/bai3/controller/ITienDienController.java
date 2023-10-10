package thi_module2.bai3.controller;

import thi_module2.bai3.model.TienDien;

import java.util.List;

public interface ITienDienController {
    List<TienDien> layDanhSach();
    void them(TienDien tienDien);
}
