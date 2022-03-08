package com.example.userauth.controller;

import com.example.userauth.entity.UserEntity;
import com.example.userauth.repository.UserRepository;
import com.example.userauth.service.UserService;
import com.example.userauth.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.Time;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.mockito.Mockito.when;

@SpringBootTest
@Slf4j
public class UserControllerTests {


    UserService mockUserService = new UserServiceImpl();

    Optional<UserEntity> testUser=null;

    @Test
    public void createNewUser_isSuccess() {

        /*testUser = new UserEntity();
         //testUser.setUserId(1);

        testUser.setUserActive("Y");
        testUser.setUsername("SA06642");
        testUser.setPassword("pass");
        testUser.setCreatedAt(LocalDateTime.now());*/
        System.out.println(testUser.toString());
        //mockUserService.saveUser(testUser);
       // Assert.hasLength(testUser.getUsername(),"User exists");

    }

    @Test
    public void getUserById_isSuccess() {

        testUser = mockUserService.getUserById(2);
        log.info("the output1 is" +testUser.toString());
        when(mockUserService.getUserById(2)).thenReturn(testUser);
        log.info("the output is" +testUser.toString());

    }

}
