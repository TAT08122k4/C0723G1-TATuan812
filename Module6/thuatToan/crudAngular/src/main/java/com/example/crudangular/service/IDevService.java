package com.example.crudangular.service;

import com.example.crudangular.model.Dev;

import java.util.List;

public interface IDevService {
    List<Dev> getAllListDev();
    void save(Dev dev);
}
