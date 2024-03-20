package com.example.front_end.service;

import com.example.front_end.model.CongCu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICongCuService {
    List<CongCu> danhSachCongCu();
    Page<CongCu> searchCongCuAndPage(String tenCongCu , int idHsx , Pageable pageable);
    void themMoiCongCu(CongCu congCu);
    CongCu findByIdCongCu(int id);
}
