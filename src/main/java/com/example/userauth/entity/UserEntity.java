package com.example.userauth.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class UserEntity {

    @Id
    private int userId ;

    private String username;
    private String password;
    private char   userActive;
    private LocalDateTime datetime;
}
