package luyentap.mvc_phuong_tien_giao_thong.repository.impl;

import luyentap.mvc_phuong_tien_giao_thong.model.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepositoryImpl implements ITransportRepository<XeTai>{
    private final List<XeTai> xeTaiList = new ArrayList<>();
    @Override
    public void createTransport(XeTai xeTai) {
        xeTaiList.add((xeTai));
    }
    @Override
    public List<XeTai> displayTransport() {
        return xeTaiList;
    }

    @Override
    public void deleteTransport(int bienSoXe) {
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (xeTaiList.get(i).equals(bienSoXe)){
                xeTaiList.remove(i);
                break;
            }else {
                System.out.println("Không tìm thấy xe bạn muốn xoá");
            }
        }

    }
    @Override
    public XeTai searchTransport(int bienSoXe) {
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (xeTaiList.get(i).equals(bienSoXe)){
                return xeTaiList.get(i);
            }
        }
        return null;
    }
}
