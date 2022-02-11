package com.example.userauth.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="permissions")
public class PermissionsEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="permission_id",nullable = false)
    private Integer permissionId;

    @Column(name="permission_action",nullable = false)
    private String permissionAction;

}
