package com.example.userauth.service.impl;

import com.example.userauth.entity.UserEntity;

import com.example.userauth.model.UserCreationRequest;
import com.example.userauth.model.UserCreationResponse;
import com.example.userauth.repository.UserRepository;
import com.example.userauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> getUserById(Integer userId) {
        return userRepository.findById(userId);
    }


    @Override
    public UserCreationResponse createNewUser(UserCreationRequest newUser) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(newUser.getUserName());
        userEntity.setPassword(newUser.getPassword());
        userEntity.setUserActive("Y");
        userEntity.setCreatedAt(LocalDateTime.now());
        userEntity = userRepository.save(userEntity);

        UserCreationResponse userCreationResponse = new UserCreationResponse();
        userCreationResponse.setUserId(userEntity.getUserId());
        userCreationResponse.setUsername(userEntity.getUsername());
        userCreationResponse.setUserActive(userEntity.getUserActive());
        userCreationResponse.setCreatedAt(userEntity.getCreatedAt());

        return userCreationResponse;
    }
}
