package com.cl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Around -> before ->
 * 	after -> after return -> after-throw -> 业务逻辑（抛出异常后回退到after）
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(public * com.cl.aop.*.*(..))")
    public void serviceMethods() {}

    @Before("serviceMethods()")
    public void logBeforeMethodCall() {
        System.out.println("[前置通知]");
    }

    @After("serviceMethods()")
    public void logAfterMethodCall() {
        System.out.println("[后置通知]");
    }

    @AfterReturning(
            pointcut = "serviceMethods()",
            returning = "result"
    )
    public void logAfterSuccessfulReturn(Object result) {
        System.out.println("[返回通知]结果: " + result);
    }

    @AfterThrowing(
            pointcut = "serviceMethods()",
            throwing = "ex"
    )
    public void logAfterThrowing(Exception ex) {
        System.out.println("[异常通知] 方法抛出异常: " + ex.getMessage());
    }

    @Around("serviceMethods()")
    public Object logAroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        // 获取方法签名
        String methodName = joinPoint.getSignature().getName();

        System.out.println("[环绕前通知]");

        try {
            // 执行目标方法
            Object result = joinPoint.proceed();
            System.out.println("[环绕后通知]");
            return result;
        } catch (Exception e) {
            System.out.println("[环绕通知] 方法抛出异常: " + e.getMessage());
            throw e;
        }
    }
}
