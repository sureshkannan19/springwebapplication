package com.sk.configuration;

import org.springframework.stereotype.Component;

@Component
public class MyTestService {

    public void print() {
        System.out.println(
                "My Test Service"
        );
    }
}
