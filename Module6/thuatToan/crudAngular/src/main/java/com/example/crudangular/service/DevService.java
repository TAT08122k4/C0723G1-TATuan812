package com.example.crudangular.service;

import com.example.crudangular.model.Dev;
import com.example.crudangular.repository.DevRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevService implements IDevService {
    @Autowired
    DevRepository devRepository;

    @Override
    public List<Dev> getAllListDev() {
        return devRepository.findAll();
    }

    @Override
    public void save(Dev dev) {
         devRepository.save(dev);
    }
}
