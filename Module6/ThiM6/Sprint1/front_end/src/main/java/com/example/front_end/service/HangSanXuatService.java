package com.example.front_end.service;

import com.example.front_end.model.HangSanXuat;
import com.example.front_end.repository.ICongCuRepository;
import com.example.front_end.repository.IHangSanXuatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangSanXuatService implements IHangSanXuatService {
    @Autowired
    IHangSanXuatRepository iHangSanXuatRepository;

    @Override
    public List<HangSanXuat> getList() {
        return iHangSanXuatRepository.findAll();
    }

    @Override
    public HangSanXuat findById(int id) {
        return iHangSanXuatRepository.findById(id).get();
    }
}
