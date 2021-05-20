package com.example.mapper;

import com.example.entity.User;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {
    List<User> UserLogin(@RequestParam(value = "loginname") String loginname, @RequestParam(value = "password") String password);

    int addUser(User user);
}
