package com.cl;

import cn.hutool.extra.spring.SpringUtil;
import com.cl.service.A;
import com.cl.service.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@EnableAsync
@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {
    public static void main(String[] args) {
      
        SpringApplication.run(Application.class);
        Object a = SpringUtil.getBean(A.class);
        Object b = SpringUtil.getBean(B.class);
        System.out.println("启动成功");

//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        applicationContext.refresh();
//        ServiceA bean = applicationContext.getBean(ServiceA.class);
    }
}
