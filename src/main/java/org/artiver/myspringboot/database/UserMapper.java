package org.artiver.myspringboot.database;

import org.apache.ibatis.annotations.*;
import org.artiver.myspringboot.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
// 用于告诉spring框架此接口的实现类由Mybatis负责创建，并将其实现类对象存储到spring容器中
@Repository
// 该注解主要用在持久层的接口上
public interface UserMapper {
    @Select("select id, username from users")
    List<User> queryAll();

    List<User> queryCustom(String username, String password);

    List<User> queryInLine(@Param("username") String var1, @Param("password") String var2);
}
