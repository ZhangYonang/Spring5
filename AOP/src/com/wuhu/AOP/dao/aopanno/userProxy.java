package com.wuhu.AOP.dao.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect // 生成代理对象
@Order(1)
public class userProxy {
    // 相同切入点抽取
    @Pointcut(value = "execution(* com.wuhu.AOP.dao.aopanno.User.add(..))")
    public void pointdemo(){

    }
    // @Before注解表示作为前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before...");
    }
    // 后置通知（返回通知）
    @AfterReturning(value = "execution(* com.wuhu.AOP.dao.aopanno.User.add(..))")
    public void AfterReturning(){
        System.out.println("AfterReturning...");
    }
    // 最终通知
    @After(value = "execution(* com.wuhu.AOP.dao.aopanno.User.add(..))")
    public void After(){
        System.out.println("After...");
    }
    // 环绕之后
    @AfterThrowing(value = "execution(* com.wuhu.AOP.dao.aopanno.User.add(..))")
    public void AfterThrowing(){
        System.out.println("AfterThrowing...");
    }
    // 环绕通知
    @Around(value = "execution(* com.wuhu.AOP.dao.aopanno.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前...");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后...");
    }
}
