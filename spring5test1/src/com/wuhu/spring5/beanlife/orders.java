package com.wuhu.spring5.beanlife;

public class orders {

    public orders() {
        System.out.println("1.执行无参构造创建bean的实例");
    }

    private String oname;

    public void setOname(String oname) {
        System.out.println("2.调用set方法设置属性的值");
        this.oname = oname;
    }

    public void initMethod(){
        System.out.println("3.执行初始化的方法");
    }
}






























