package com.example.userauth.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="role")
public class RoleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id",nullable = false)
    private Integer roleId;

    @Column(name="role_description",nullable = false)
    private String roleDescription;

    @Column(name="role_type",nullable = false)
    private String roleType;

}
