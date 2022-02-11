package com.example.userauth.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="users")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id",nullable = false)
    private Integer userId ;

    @Column(name="user_name",nullable = false)
    private String username;

    @Column(name="password",nullable = false)
    private String password;

    @Column(name="user_active",nullable = false)
    private String   userActive;

    @Column(name="created_at",nullable = false)
    private LocalDateTime createdAt;
}
