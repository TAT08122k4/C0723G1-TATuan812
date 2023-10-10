package thi_module2.bai3.repository.Impl;

import thi_module2.bai3.model.TienDien;
import thi_module2.bai3.repository.ITienDienRepository;
import thi_module2.bai3.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class TienDienRepository implements ITienDienRepository {
    private final String DAU_PHAY = " , ";
    private final String FILE_NGUON = "E:\\CodeGym FullTime\\Module2\\thiModule2\\src\\thi_module2\\bai3\\data\\hoa_don_tien_dien.csv";
    @Override
    public List<TienDien> layDanhSach() {
        return converToObj(ReadAndWrite.read(FILE_NGUON));
    }
    public List<TienDien> converToObj(List<String> strings){
        List<TienDien> tienDiens = new ArrayList<>();
        String [] data;
        for (String str : strings){
            data = str.split(DAU_PHAY);
            tienDiens.add(new TienDien(data[0],data[1],data[2],Integer.parseInt(data[3])));
        }
        return tienDiens;
    }
    public List<String> convertToString(List<TienDien> tienDiens){
        List<String> strings = new ArrayList<>();
        for (TienDien tienDien : tienDiens){
            strings.add(tienDien.getMaHoaDon() + DAU_PHAY + tienDien.getHoTen() + DAU_PHAY +
                    tienDien.getLoaiKhachHang() + DAU_PHAY + tienDien.getMucTieuThu());
        }
        return strings;
    }

    @Override
    public void them(TienDien tienDien) {
        List<TienDien> tienDiens = layDanhSach();
        tienDiens.add(tienDien);
        ReadAndWrite.write(FILE_NGUON,convertToString(tienDiens));

    }
}
