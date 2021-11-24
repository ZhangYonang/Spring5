package com.wuhu.spring5.paper;

public class paperFactory1 {
    public paperImpl createPaper(){
        System.out.println("factory");
        return new paperImpl();
    }
}
