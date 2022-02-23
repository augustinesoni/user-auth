package com.example.userauth.service;

import com.example.userauth.entity.UserEntity;
import com.example.userauth.model.UserCreationRequest;
import com.example.userauth.model.UserCreationResponse;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface UserService {

    /**
     * Get all UserEntity info
     * @return - list of all UserEntity
     */
    public Iterable<UserEntity> getAllUsers();
    /**
     * Get UserEntity info by id
     * @param userId - id of the User
     * @return UserEntity - the User entity for the id
     */
    public Optional<UserEntity> getUserById(Integer userId);


    UserCreationResponse createNewUser(UserCreationRequest newUser);
}
