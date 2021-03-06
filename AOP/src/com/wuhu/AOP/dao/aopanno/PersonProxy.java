package com.wuhu.AOP.dao.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class PersonProxy {
    @Before(value = "execution(* com.wuhu.AOP.dao.aopanno.User.add(..))")
    public void Before(){
        System.out.println("PersonBefore...");
    }
}
