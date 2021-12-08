package com.wuhu.AOP.dao;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class jdkProxy {
    public static void main(String[] args) {
        // 创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        userDaoImpl userDao = new userDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(jdkProxy.class.getClassLoader(), interfaces, new userDaoProxy(userDao));
        int result = dao.add(1,2);
        System.out.println("result"+result);

    }
}
// 创建代理对象代码
class userDaoProxy implements InvocationHandler{
    // 把需要创建代理对象的对象传递过来
    // 有参数构造床底
    private Object obj;
    public userDaoProxy(Object obj){
        this.obj = obj;
    }
    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前
        System.out.println("方法之前执行..."+method.getName()+"传递的参数..."+ Arrays.toString(args));
        // 被增强的方法
        Object res = method.invoke(obj,args);
        // 方法之后
        System.out.println("方法之后执行..."+obj);
        return null;
    }
}











