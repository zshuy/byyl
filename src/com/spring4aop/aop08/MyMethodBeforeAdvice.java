package com.spring4aop.aop08;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置通知：在目标方法执行之前执行
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    /**
     * 当前方法在目标方法执行之前执行
     * @param method 目标方法
     * @param objects 目标方法参数
     * @param o 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        //对目标方法的增强代码书写在这里
        System.out.println("执行前置通知");
    }
}
