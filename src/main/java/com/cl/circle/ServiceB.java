package com.cl.circle;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class ServiceB {

    @Autowired
    private ServiceA serviceA;
}
