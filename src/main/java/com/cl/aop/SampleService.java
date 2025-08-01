package com.cl.aop;


import org.springframework.stereotype.Component;

@Component
public class SampleService {

    public String normalOperation() {
        System.out.println("业务执行成功");
        int a = 1/0;
        return "业务操作成功";
    }

    public void problematicOperation() {
        throw new RuntimeException("模拟业务异常");
    }
}