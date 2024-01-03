package com.example.quan_ly_cau_thu.service;

import com.example.quan_ly_cau_thu.model.Player;
import com.example.quan_ly_cau_thu.repository.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService implements IPlayerService{
    @Autowired
    private IPlayerRepository iPlayerRepository;
    @Override
    public List<Player> getAll() {
        return iPlayerRepository.findAll();
    }

    @Override
    public void addPlayer(Player player) {
        iPlayerRepository.save(player);
    }

    @Override
    public void updatePlayer(Player player) {
        iPlayerRepository.save(player);
    }

    @Override
    public void deletePlayer(int id) {
        iPlayerRepository.deleteById(id);
    }
}
