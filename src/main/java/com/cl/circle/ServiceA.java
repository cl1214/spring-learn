package com.cl.circle;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Data
@Component
public class ServiceA {

    @Autowired
    private ServiceB serviceB;

    @Async
    public void test() {

    }
}
