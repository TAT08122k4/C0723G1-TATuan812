package com.example.front_end.service;

import com.example.front_end.model.ChiTietMuon;
import com.example.front_end.repository.IChiTietMuonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiTietMuonService implements IChiTietMuonService{
    @Autowired
    IChiTietMuonRepository chiTietMuonRepository;
    @Override
    public void save(ChiTietMuon chiTietMuon) {
        chiTietMuonRepository.save(chiTietMuon);

    }
}
