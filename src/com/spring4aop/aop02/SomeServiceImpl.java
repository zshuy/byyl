package com.spring4aop.aop02;

public class SomeServiceImpl implements ISomeService {
    @Override
    public void doFirst() {
        System.out.println("执行doFirst");
    }

    @Override
    public void doSecond() {
        System.out.println("执行doSecond");
    }
}