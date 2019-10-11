package com.spring4aop.aop06;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception ex) {
        System.out.println("执行异常通知");
    }
}
