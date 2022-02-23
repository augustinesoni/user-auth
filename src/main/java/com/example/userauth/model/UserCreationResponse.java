package com.example.userauth.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserCreationResponse {

    private Integer userId ;
    private String username;
    private String userActive;
    private LocalDateTime createdAt;

}
