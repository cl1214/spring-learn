package com.cl.postconstruct;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PostConstructService {
    private String a;

    @PostConstruct
    private void initA() {
        a = "111";
        System.out.println("执行PostConstruct成功");
    }

    @PreDestroy
    private void destoryA() {
        System.out.println("执行destoryA成功");
    }

}
