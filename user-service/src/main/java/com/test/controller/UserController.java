package com.test.controller;

import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qianyu
 * @title
 * @Package com.test.controller
 * @date 2022/5/4 01:25
 */
@RestController
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/user/{uid}")
    User findUserById(@PathVariable("uid") int uid){
        System.out.println("我被调用了!");
        return userService.getUserById(uid);
    }

}

