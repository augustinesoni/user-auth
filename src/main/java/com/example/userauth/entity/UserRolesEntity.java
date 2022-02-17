package com.example.userauth.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="user_roles")
public class UserRolesEntity {

    @EmbeddedId
    UserRolesId userRolesId;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, targetEntity = UserEntity.class)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", updatable = false, insertable = false)
    UserEntity userEntity;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, targetEntity = RoleEntity.class)
    @JoinColumn(name = "role_id", referencedColumnName = "role_id", updatable = false, insertable = false)
    RoleEntity roleEntity;

}
