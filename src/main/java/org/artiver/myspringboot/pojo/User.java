package org.artiver.myspringboot.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
// 使用该注解等于实现了pojo类的tostring getter setter hash equals等方法
@NoArgsConstructor
// 自动生成无参构造函数
@AllArgsConstructor
// 自动生成所有参数的构造函数
@JsonInclude(value = JsonInclude.Include.NON_NULL)
// 返回json响应时自动去除null的字段
public class User {
    int id;
    String username;
    String password;
}
