package com.wuhu.spring5.test;

public class book {
    private String name;

    public book() {
    }

    public book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
