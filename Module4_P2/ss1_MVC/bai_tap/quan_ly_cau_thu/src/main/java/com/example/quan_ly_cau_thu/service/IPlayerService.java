package com.example.quan_ly_cau_thu.service;

import com.example.quan_ly_cau_thu.model.Player;

import java.util.List;

public interface IPlayerService {
    List<Player> getAll();
    void addPlayer(Player player);
    void updatePlayer(Player player);
    void deletePlayer(int id);
}
