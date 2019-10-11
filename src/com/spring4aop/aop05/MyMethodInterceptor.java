package com.spring4aop.aop05;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知，可以修改返回结果
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕通知：目标方法执行之前");
        Object result = methodInvocation.proceed();
        System.out.println("环绕通知：目标方法执行之后");
        if (result != null)
            result = ((String)result).toUpperCase();
        return result;
    }
}
