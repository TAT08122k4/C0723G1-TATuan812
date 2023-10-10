package thi_module2.bai3.service.Impl;

import thi_module2.bai3.model.TienDien;
import thi_module2.bai3.repository.ITienDienRepository;
import thi_module2.bai3.repository.Impl.TienDienRepository;
import thi_module2.bai3.service.ITienDienService;

import java.util.List;

public class TienDienService implements ITienDienService {
    ITienDienRepository tienDienRepository = new TienDienRepository();
    @Override
    public List<TienDien> layDanhSach() {
        return tienDienRepository.layDanhSach();
    }

    @Override
    public void them(TienDien tienDien) {
        tienDienRepository.them(tienDien);
    }
}
