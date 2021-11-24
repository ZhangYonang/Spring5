package com.wuhu.spring5.bean;

public class Course {
    private String name;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name){
        this.name = name;
    }
}
