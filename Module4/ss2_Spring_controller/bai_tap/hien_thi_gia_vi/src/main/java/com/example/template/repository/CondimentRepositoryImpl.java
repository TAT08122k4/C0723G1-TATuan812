package com.example.template.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CondimentRepositoryImpl implements ICondimentRepository{
    private static final List<String> condimentList = new ArrayList<>();
    @Override
    public void save(String condiments) {
        condimentList.add(condiments);
    }
}
