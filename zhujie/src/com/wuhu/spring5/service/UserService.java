package com.wuhu.spring5.service;

import com.wuhu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// 在注解里面value属性值可以省略不写
// 首字面小写的默认类名称
@Service
public class UserService {

    @Value(value = "abc")
    private String name;
    @Autowired // 根据类型进行注入
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;
    public void add(){
        System.out.println("Service add......");
    }
}




















