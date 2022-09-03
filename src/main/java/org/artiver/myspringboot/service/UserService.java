package org.artiver.myspringboot.service;

import org.artiver.myspringboot.database.UserMapper;
import org.artiver.myspringboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// 标记当前类是一个service类，加上该注解会将当前类自动注入到spring容器，后面就能Autowired自动装配了
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.queryAll();
    }

    public List<User> getCustomUsers(String username, String password) {
        return userMapper.queryCustom(username, password);
    }
}
