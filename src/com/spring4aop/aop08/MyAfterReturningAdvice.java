package com.spring4aop.aop08;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 后置通知：可以获取目标方法的返回结果，但不能改变返回值
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    /**
     * 当前方法在目标方法执行之后执行
     * @param o 目标方法的返回值
     * @param method 目标方法
     * @param objects 目标方法参数
     * @param o1 目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行后置通知方法");
        System.out.println(o);
    }
}
