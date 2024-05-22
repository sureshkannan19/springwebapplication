package com.sk.configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class MyTestBean {
    @Autowired
    public MyTestService testService;

    public MyTestBean() {
        System.out.println("Inside MyBean");
    }
}