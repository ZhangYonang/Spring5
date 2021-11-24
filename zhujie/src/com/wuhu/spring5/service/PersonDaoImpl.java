package com.wuhu.spring5.service;

import com.wuhu.spring5.dao.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class PersonDaoImpl {
    @Autowired
    @Qualifier(value = "person")
    private Person person;
    @Value(value = "id=12,name=1211")
    private Person person1;

}
