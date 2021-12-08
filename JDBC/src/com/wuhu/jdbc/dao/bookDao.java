package com.wuhu.jdbc.dao;

import com.wuhu.jdbc.entity.book;
import org.springframework.beans.factory.annotation.Autowired;

public interface bookDao {
    // 添加
    void add(book book);
}
