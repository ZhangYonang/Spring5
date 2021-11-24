package com.wuhu.spring5.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository(value = "dog")
public class Dog {
    @Value(value = "2")
    private int age;
    @Value(value = "狗")
    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


