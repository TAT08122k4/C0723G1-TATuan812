package luyentap.mvc_phuong_tien_giao_thong.repository.impl;

import luyentap.mvc_phuong_tien_giao_thong.model.XeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepository implements ITransportRepository<XeMay>{
    private final List<XeMay> xeMayList = new ArrayList<>();
    @Override
    public void createTransport(XeMay xeMay) {
        xeMayList.add((xeMay));
    }
    @Override
    public List<XeMay> displayTransport() {
        return xeMayList;
    }

    @Override
    public void deleteTransport(int bienSoXe) {
        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i).equals(bienSoXe)) {
                xeMayList.remove(i);
                break;
            }else {
                System.out.println("Không tìm thấy xe bạn muốn xoá");
            }
        }

    }

    @Override
    public XeMay searchTransport(int bienSoXe) {
        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i).equals(bienSoXe)){
                return xeMayList.get(i);
            }
        }
         return null;
    }
}
