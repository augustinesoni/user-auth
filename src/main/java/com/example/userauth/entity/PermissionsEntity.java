package com.example.userauth.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class PermissionsEntity {

    @Id
    int permissionId;

    int menuItemId;
    char menuItemView;
    char menuItemEdit;
    char menuItemDelete;

}
