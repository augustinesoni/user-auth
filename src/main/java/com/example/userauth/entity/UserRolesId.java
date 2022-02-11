package com.example.userauth.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class UserRolesId implements Serializable {

    @Column(name = "user_id",nullable = false)
    private Integer userId;

    @Column(name = "role_id",nullable = false)
    private Integer roleId;


}
