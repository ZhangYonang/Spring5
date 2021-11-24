package com.wuhu.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository(value = "person")
public class Person {
    @Value(value = "芜湖")
    private String name;
    @Value(value = "12")
    private int age;
    @Autowired
    @Qualifier(value = "dog")
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog.toString() +
                '}';
    }
}
