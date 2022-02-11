package com.example.userauth.service.impl;

import com.example.userauth.entity.UserEntity;
import com.example.userauth.repository.UserRepository;
import com.example.userauth.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.sql.Types.NULL;

@Service
public class UserAuthServiceImpl implements UserAuthService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean validateUser(String username, String password) {
         if (username == null || password == null)
             return false;

         if (!checkIfExists(username,password))
                return false;

         return true;
    }

    private boolean checkIfExists(String username, String password) {
        //if (userRepository.findByUsernamePassword(username,password).equals(null))
          //  return false;

        return true;
    }

    @Override
    public Optional<UserEntity> getUser(int userID) {
        return  userRepository.findById(userID);
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
