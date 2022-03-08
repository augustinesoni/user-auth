package com.example.userauth.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany
    @JoinTable (
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<RoleEntity> roles = new HashSet<>();
}
