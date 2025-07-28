package com.cl.circle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ServiceAspect {

    // 定义切入点：匹配com.example.service包下的所有方法
//    @Pointcut("execution(* com.cl.circle.ServiceA.*(..))")
    public void serviceMethods() {}

    // 环绕通知（最强大的通知类型）
//    @Around("serviceMethods()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知 - 方法执行前");

        // 执行目标方法
        Object result = joinPoint.proceed();

        System.out.println("环绕通知 - 方法执行后");
        return result;
    }
}