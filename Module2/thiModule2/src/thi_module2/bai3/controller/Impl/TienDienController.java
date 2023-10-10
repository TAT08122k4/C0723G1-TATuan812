package thi_module2.bai3.controller.Impl;

import thi_module2.bai3.controller.ITienDienController;
import thi_module2.bai3.model.TienDien;
import thi_module2.bai3.service.ITienDienService;
import thi_module2.bai3.service.Impl.TienDienService;

import java.util.List;

public class TienDienController implements ITienDienController {
    ITienDienService tienDienService = new TienDienService();
    @Override
    public List<TienDien> layDanhSach() {
        return tienDienService.layDanhSach();
    }

    @Override
    public void them(TienDien tienDien) {
        tienDienService.them(tienDien);
    }
}
