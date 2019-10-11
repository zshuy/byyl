package com.spring4aop.aop06;

public class SomeServiceImpl implements ISomeService {
    @Override
    public void doFirst() {
        System.out.println("执行doFirst");
        int a = 1/0;
    }

    @Override
    public String doSecond() {
        System.out.println("执行doSecond");
//        int a = 1/0;
        return "aaaa";
    }
}
