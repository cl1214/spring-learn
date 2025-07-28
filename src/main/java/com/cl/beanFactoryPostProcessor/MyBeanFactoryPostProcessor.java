package com.cl.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * beanFactory初始化后的扩展接口.用于修改bean定义或者动态注册bean定义
 * 如ConfigurationClassPostProcessor，用于扫描@Bean、@Configuration、@ComponentScan、@Import，识别类后注入到spring容器
 * PropertySourcesPlaceholderConfigurer，用于处理属性占位符，加载属性源
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // BeanFactoryPostProcessor，beanFactory初始化后的扩展接口，主要用于修改已注册的 Bean 定义
        BeanDefinition a = beanFactory.getBeanDefinition("a");
        a.getPropertyValues().add("a", "aaaa");
    }
}
