package com.example.quan_ly_cau_thu.repository;

import com.example.quan_ly_cau_thu.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerRepository extends JpaRepository<Player,Integer> {
}
