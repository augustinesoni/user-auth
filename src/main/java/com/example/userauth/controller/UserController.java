package com.example.userauth.controller;

import com.example.userauth.entity.UserEntity;
import com.example.userauth.model.UserCreationRequest;
import com.example.userauth.model.UserCreationResponse;
import com.example.userauth.repository.UserRepository;
import com.example.userauth.service.UserService;

import lombok.Data;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Iterable<UserEntity> getAllUsers() {

        return userService.getAllUsers();

    }

    @GetMapping("/user/{userId}")
    public Optional<UserEntity> getUser(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/user/createUser")
    public ResponseEntity createUser(@RequestBody UserCreationRequest newUser) {

        UserCreationResponse userCreationResponse = userService.createNewUser(newUser);

        return ResponseEntity.ok(userCreationResponse);


    }

}
