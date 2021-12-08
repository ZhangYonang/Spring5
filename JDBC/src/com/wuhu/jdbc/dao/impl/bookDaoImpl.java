package com.wuhu.jdbc.dao.impl;

import com.wuhu.jdbc.dao.bookDao;
import com.wuhu.jdbc.entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class bookDaoImpl implements bookDao {
    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
    // 添加
    @Override
    public void add(book book) {
        String sql = "insert into user value (?)";
        Object[] args = {book.getUsername()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }
}




















