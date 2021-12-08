package com.wuhu.jdbc.service;

import com.wuhu.jdbc.dao.bookDao;
import com.wuhu.jdbc.entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookService {
    // 注入dao
    @Autowired
    private bookDao bookDao;
    public void addBook(book book){
        bookDao.add(book);
    }
}
