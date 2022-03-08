package com.example.userauth.service.impl;

import com.example.userauth.entity.RoleEntity;
import com.example.userauth.entity.UserEntity;
import com.example.userauth.service.RoleService;

public class RoleServiceImpl implements RoleService {

    UserEntity userEntity;


    @Override
    public Iterable<RoleEntity> getRoles() {
        return userEntity.getRoles();
    }
}
