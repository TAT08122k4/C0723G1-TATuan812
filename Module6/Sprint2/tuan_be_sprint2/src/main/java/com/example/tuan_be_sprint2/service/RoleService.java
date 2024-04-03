package com.example.tuan_be_sprint2.service;

import com.example.tuan_be_sprint2.model.Role;
import com.example.tuan_be_sprint2.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleService implements IRoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public Role findIdByRole(int id) {
        return roleRepository.findById(id).get();
    }
}
