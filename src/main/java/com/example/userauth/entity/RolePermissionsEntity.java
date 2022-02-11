package com.example.userauth.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="role_permissions")
public class RolePermissionsEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_permission_id",nullable = false)
    private Integer rolePermissionId;

    @Column(name="role_id",nullable = false)
    private int roleId;

    @Column(name="permission_id",nullable = false)
    private int permissionId;


}
