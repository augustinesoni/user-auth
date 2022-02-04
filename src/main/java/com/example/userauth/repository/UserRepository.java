package com.example.userauth.repository;

import com.example.userauth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    UserEntity getUserDetails(int userID);

}
