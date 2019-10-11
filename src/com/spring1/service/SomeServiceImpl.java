package com.spring1.service;

public class SomeServiceImpl implements ISomeService {
    private int a = 5;

    {
        System.out.println("动态代码块 a=" + a);
    }

    public SomeServiceImpl() {
        System.out.println("构造方法 a=" + a);
    }

    @Override
    public void doSome() {
        System.out.println("执行doSome()方法");
    }
}
