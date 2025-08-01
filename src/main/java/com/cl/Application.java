package com.cl;

import com.cl.aop.SampleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@EnableWebMvc
//@EnableAsync
//@SpringBootApplication
//@EnableAspectJAutoProxy
public class Application {
    public static void main(String[] args) {
      
//        SpringApplication.run(Application.class);
//        System.out.println("启动成功");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SampleService bean = applicationContext.getBean(SampleService.class);
        bean.normalOperation();
    }
}
