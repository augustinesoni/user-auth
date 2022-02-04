package com.example.userauth.service;


public interface UserAuthService {
    boolean validateUser(String username, String password);
    String getUserRoles(int userID);
    String getUserPermissions(int userID);
}
