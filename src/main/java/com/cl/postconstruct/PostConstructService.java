package com.cl.postconstruct;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

/**
 * @PostConstruct基于CommonAnnotationBeanPostProcessor，继承自InitDestroyAnnotationBeanPostProcessor，
 * 在postProcessBeforeInitialization期间扫描bean被@PostConstruct和@PreDestroy修饰的方法，然后执行被@PostConstruct修饰的方法
 * 被@PreDestroy修饰的方法在销毁时由InitDestroyAnnotationBeanPostProcessor#postProcessBeforeDestruction调用执行
 */
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
