package com.wuhu.AOP.dao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.wuhu"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
