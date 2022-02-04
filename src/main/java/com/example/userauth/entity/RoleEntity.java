package com.example.userauth.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class RoleEntity {

    @Id
    int roleId;

    String roleDescription;
    String roleType;

}
