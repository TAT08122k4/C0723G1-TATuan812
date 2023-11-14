package com.example.demo.repository.Impl;

import com.example.demo.Utils.BaseRepository;
import com.example.demo.modal.HangHoa;
import com.example.demo.repository.IDanhSachMatHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DanhSachMatHang implements IDanhSachMatHang {
    private final String SELECT_ALL = "select * from products;";
    @Override
    public List<HangHoa> hienThiHangHoa() {
        List<HangHoa> hangHoaList= new ArrayList<>();
        BaseRepository baseRepository = new BaseRepository();
        try {
            Connection connection = baseRepository.getConnectDB();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String maHangHoa = rs.getString("ma_hang_hoa");
                String tenHangHoa = rs.getString("ten_hang_hoa");
                String donViTinh = rs.getString("don_vi_tinh");
                int gia = rs.getInt("gia");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
