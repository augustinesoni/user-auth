package com.example.userauth.service.impl;

import com.example.userauth.service.UserAuthService;
import org.springframework.stereotype.Service;

@Service
public class UserAuthServiceImpl implements UserAuthService {
    @Override
    public boolean validateUser(String username, String password) {
        return false;
    }

    @Override
    public String getUserRoles(int userID) {
        return null;
    }

    @Override
    public String getUserPermissions(int userID) {
        return null;
    }
}
