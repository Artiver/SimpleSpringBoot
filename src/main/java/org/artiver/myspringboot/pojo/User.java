package org.artiver.myspringboot.pojo;

import lombok.Data;

@Data
// 使用该注解等于实现了pojo类的tostring getter setter hash equals等方法
public class User {
    int id;
    String username;
    String password;
}
