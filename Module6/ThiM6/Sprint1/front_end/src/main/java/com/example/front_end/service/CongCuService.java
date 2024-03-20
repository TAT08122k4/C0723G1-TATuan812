package com.example.front_end.service;

import com.example.front_end.model.CongCu;
import com.example.front_end.repository.ICongCuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongCuService implements ICongCuService{
    @Autowired
    ICongCuRepository congCuRepository;
    @Override
    public List<CongCu> danhSachCongCu() {
        return congCuRepository.findAll();
    }

    @Override
    public Page<CongCu> searchCongCuAndPage(String tenCongCu, int idHsx, Pageable pageable) {

        return congCuRepository.searchCongCuAndPage('%' + tenCongCu + '%' , idHsx,pageable);
    }

    @Override
    public void themMoiCongCu(CongCu congCu) {
        congCuRepository.save(congCu);
    }

    @Override
    public CongCu findByIdCongCu(int id) {
        return congCuRepository.findById(id).get();
    }
}
