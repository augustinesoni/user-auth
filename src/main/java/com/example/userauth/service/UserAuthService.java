package com.example.userauth.service;


import com.example.userauth.entity.UserEntity;

import java.util.Optional;

public interface UserAuthService {
    boolean validateUser(String username, String password);
    Optional<UserEntity> getUser(int userID);
    String getUserRoles(int userID);
    String getUserPermissions(int userID);
}
