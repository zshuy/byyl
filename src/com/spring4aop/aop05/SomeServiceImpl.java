package com.spring4aop.aop05;

public class SomeServiceImpl implements ISomeService {
    @Override
    public void doFirst() {
        System.out.println("执行doFirst");
    }

    @Override
    public String doSecond() {
        System.out.println("执行doSecond");
        return "aaaa";
    }
}
