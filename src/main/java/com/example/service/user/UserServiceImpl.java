package com.example.service.user;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> UserLogin(String name, String password) {
        List<User> users=userMapper.UserLogin(name, password);
        return users;
    }

    @Override
    public int addUser(User user) {
        int res = userMapper.insertSelective(user);
        return res;
    }


}
