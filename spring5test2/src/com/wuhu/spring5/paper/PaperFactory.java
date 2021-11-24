package com.wuhu.spring5.paper;

public class PaperFactory {
    public static paperImpl createpaper(){
        System.out.println("createpaper");
        return new paperImpl();
    }
}
