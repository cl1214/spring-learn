package com.cl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.cl")
public class AppConfig {

//    @Bean
//    public A a1() {
//        return new A();
//    }
}
