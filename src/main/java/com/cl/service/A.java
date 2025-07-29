package com.cl.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class A {
    @Value("${datebase.url}")
    private String dateBaseUrl;
    private String a;
}
