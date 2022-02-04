package com.example.userauth.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class UserRolesEntity {

    @EmbeddedId
    UserRolesId userRolesId;

}
