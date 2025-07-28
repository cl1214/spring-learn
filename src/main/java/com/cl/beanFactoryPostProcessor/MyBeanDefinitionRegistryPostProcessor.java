package com.cl.beanFactoryPostProcessor;

import com.cl.service.B;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        // BeanFactoryPostProcessor的子接口，不仅可以修改bean定义，也可以动态注册bean定义，
        RootBeanDefinition beanDefinition = new RootBeanDefinition(B.class);
        registry.registerBeanDefinition("b", beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition b = beanFactory.getBeanDefinition("b");
        b.getPropertyValues().add("b", "bbbb");
    }
}
