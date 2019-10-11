package com.spring4aop.aop11;

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

    @Override
    public void doThird() {
        System.out.println("执行doThird");
    }
}
