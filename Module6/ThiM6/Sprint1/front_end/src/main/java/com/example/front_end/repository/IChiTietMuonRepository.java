package com.example.front_end.repository;


import com.example.front_end.model.ChiTietMuon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChiTietMuonRepository extends JpaRepository<ChiTietMuon,Integer> {
}
