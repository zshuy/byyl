package com.spring4aop.aop01;

public class SomeServiceImpl implements ISomeService {
    @Override
    public void doFirst() {
        SystemService.doTx();
        System.out.println("执行doFirst");
        SystemService.doLog();
    }

    @Override
    public void doSecond() {
        SystemService.doTx();
        System.out.println("执行doSecond");
        SystemService.doLog();
    }
}
