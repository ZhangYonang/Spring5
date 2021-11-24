package com.wuhu.spring5.test;

import com.wuhu.spring5.bean.Book;
import com.wuhu.spring5.bean.Course;
import com.wuhu.spring5.bean.MyBean;
import com.wuhu.spring5.bean.Stu;
import com.wuhu.spring5.beanlife.orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class test {
    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }
    @Test
    public void testCollection1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
    @Test
    public void testBeanLife(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanoresrs.xml");
        orders orders = context.getBean("orders", orders.class);
        System.out.println("4.获取创建bean实例的对象");
        System.out.println(orders);
    }
}





































