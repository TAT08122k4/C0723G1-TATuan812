package com.example.template.service;

import com.example.template.repository.CondimentRepositoryImpl;
import com.example.template.repository.ICondimentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CondimentService implements ICondimentService {
    private final ICondimentRepository condimentRepository = new CondimentRepositoryImpl();

    @Override
    public void save(String condiments) {
        condimentRepository.save(condiments);
    }
}
