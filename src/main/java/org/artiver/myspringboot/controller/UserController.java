package org.artiver.myspringboot.controller;

import org.artiver.myspringboot.pojo.User;
import org.artiver.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// rest风格的接口 原来返回json需要@ResponseBody和@Controller配合 即@RestController是@ResponseBody和@Controller的组合注解
@RequestMapping("user")
// 请求url前缀
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("getCustom")
    public List<User> getCustomUsers(@RequestBody User user) {
        return userService.getCustomUsers(user.getUsername(), user.getPassword());
    }

    @PostMapping("getInline")
    public List<User> getInlineUser(@RequestBody User user) {
        return userService.getInlineUsers(user.getUsername(), user.getPassword());
    }

}
