package com.spring4aop.aop07;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(UsernameException ex) {
        System.out.println("发生用户名异常ex=" + ex.getMessage());
    }

    public void afterThrowing(PasswordException ex) {
        System.out.println("发生用户密码异常ex=" + ex.getMessage());
    }

    public void afterThrowing(Exception ex) {
        System.out.println("其他异常");
    }
}
