package com.youtube.jwt.service.impl;

import com.youtube.jwt.entity.Role;
import com.youtube.jwt.repository.RoleRepository;
import com.youtube.jwt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role createNewRole(Role role) {
        return roleRepository.save(role);
    }
}
