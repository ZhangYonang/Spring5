package com.wuhu.spring5.service;

import com.wuhu.spring5.dao.userDao;

public class userService {
    // 创建UserDao类型属性，生成set方法
    private userDao userDao;
    public void setUserDao(com.wuhu.spring5.dao.userDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        System.out.println("service add.......");
        userDao.update();
    }
}




















