package com.spring4aop.aop02;

public class SystemService {
    public static void doLog() {
        System.out.println("执行日志代码");
    }

    public static void doTx() {
        System.out.println("执行事务代码");
    }
}
