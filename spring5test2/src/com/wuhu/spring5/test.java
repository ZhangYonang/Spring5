package com.wuhu.spring5;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Paper;

public class test {
@Test
    public void testCollection(){
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    Classroom classroom = context.getBean("classroom",Classroom.class);
    System.out.println(classroom.toString());
}

}
