package com.example.userauth.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class UserRolesId implements Serializable {

    private Integer userId;
    private Integer roleId;


}
