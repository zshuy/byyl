package com.spring4aop.aop09;

public class SomeService {
    public void doFirst() {
        System.out.println("执行doFirst");
    }

    public String doSecond() {
        System.out.println("执行doSecond");
        return "aaaa";
    }
}
