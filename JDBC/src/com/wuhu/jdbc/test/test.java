package com.wuhu.jdbc.test;

import com.wuhu.jdbc.entity.book;
import com.wuhu.jdbc.service.bookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        bookService bookService = context.getBean("bookService", bookService.class);
        book book = new book();
        book.setUsername("wuhu");
        bookService.addBook(book);
    }
}

























