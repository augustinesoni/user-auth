package com.example.userauth.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="user_roles")
public class UserRolesEntity {

    @EmbeddedId
    UserRolesId userRolesId;

}
