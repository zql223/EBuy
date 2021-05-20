package com.example.controller;

import com.example.entity.User;
import com.example.service.user.UserService;
import com.example.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "login")
    @ResponseBody
    public RespBean login(@RequestParam(value = "loginname")String loginname, @RequestParam(value = "password") String password){
        List<User> list=userService.UserLogin(loginname,password);
        return RespBean.success("登录成功",list);
    }
    @RequestMapping(value = "regist",method = RequestMethod.POST)
    public RespBean zhuce(@RequestParam(value ="loginName")String loginName,
                          @RequestParam(value ="userName")String userName,
                          @RequestParam(value ="password")String password,
                          @RequestParam(value ="sex")int sex,
                          @RequestParam(value ="identityCode")String identityCode,
                          @RequestParam(value ="email")String email,
                          @RequestParam(value ="mobile")String mobile,
                          @RequestParam(value ="type")int type){
        User user=new User();
        user.setLoginName(loginName);
        user.setUserName(userName);
        user.setPassword(password);
        user.setSex(sex);
        user.setIdentityCode(identityCode);
        user.setEmail(email);
        user.setMobile(mobile);
        user.setType(type);
        int i = userService.addUser(user);
        if (i!=0){
            return RespBean.success("注册成功",i);

        }else {
            return RespBean.error("注册失败");
        }
    }
}
