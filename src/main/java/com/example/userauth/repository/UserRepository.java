package com.example.userauth.repository;

import com.example.userauth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    @Query("select userId from user where lower(username)=lower(?1) and lower(password) = lower(?2)")
    UserEntity findByUsernamePassword(String username, String password);

}
