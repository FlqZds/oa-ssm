package org.sample.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component // 声明为Spring Bean
@Aspect // 声明为切面
public class MyAspect {

    @Before("execution(* org.sample.service.*.*(..))") // 切入点表达式
    public void jpBefore(JoinPoint jpBefore) {

        // 获得进入切入点的方法的名字
        String methodName = jpBefore.getSignature().getName();
//        获得进入切入点的方法所在的类名
        String className = jpBefore.getSignature().getClass().getName();

        System.out.println("Before method execution:这是前置增强+" + className + methodName);
    }

    @After("execution(* org.sample.service.*.*(..))")
    public void jpAfter(JoinPoint jpAfter) {
        // 获得进入切入点的方法的名字
        String methodName = jpAfter.getSignature().getName();
//        获得进入切入点的方法所在的类名
        String className = jpAfter.getSignature().getClass().getName();

        System.out.println("After method execution:这是后置增强+" + className + methodName);
    }
}
