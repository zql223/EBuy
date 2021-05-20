package com.example.service.user;

import com.example.entity.User;

import java.util.List;

public interface UserService {

    List<User> UserLogin(String name, String password);

    int addUser(User user);


}
