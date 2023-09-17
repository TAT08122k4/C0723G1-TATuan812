package ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.repository.impl;

import ss9_dsa_danh_sach.bai_tap.mvc_phuong_tien_giao_thong.model.Transport;

import java.util.ArrayList;

public class TransportRepositoryImpl implements ITransportRepository {
    private static ArrayList<Transport> transports = new ArrayList<>();

    @Override
    public void createTransport(Transport transport) {
        transports.add(transport);
    }

    @Override
    public ArrayList<Transport> displayTransport() {
        return transports;
    }

    @Override
    public void deleteTransport(int bienSoxe) {
        String confirm = "Yes";
        for (int i = 0; i < transports.size(); i++) {
            if (transports.get(i).getBienKiemSoat() == bienSoxe) {
                if (confirm.equals("Yes")) {
                    transports.remove(i);
                    System.out.println("Đã Xoá thành công");
                }
            }
        }

    }

    @Override
    public void searchTransport(int bienSoXe) {
        for (int i = 0; i < transports.size(); i++) {
            if (transports.get(i).getBienKiemSoat() == bienSoXe) {
                System.out.println(transports.get(i));
            } else {
                System.out.println("Không có phương tiện nào được tìm thấy");
            }
        }
    }
}
