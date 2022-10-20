package com.example.kiashop.services.impl;

import com.example.kiashop.entities.RoleEntity;
import com.example.kiashop.repository.RoleRepository;
import com.example.kiashop.services.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository mRoleRepository;

    @Override
    public void create(RoleEntity roleEntity) {
        mRoleRepository.save(roleEntity);
    }
}
