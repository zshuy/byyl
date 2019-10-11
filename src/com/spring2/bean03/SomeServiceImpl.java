package com.spring2.bean03;

public class SomeServiceImpl implements ISomeService {

    public SomeServiceImpl() {
        System.out.println("构造方法");
    }

    @Override
    public String doSome() {
        System.out.println("执行doSome()方法");
        return "abcde";
    }

    @Override
    public String doOther() {
        System.out.println("执行doOther()方法");
        return "hijkl";
    }

    @Override
    public void setUp() {
        System.out.println("生命开始");
    }

    @Override
    public void tearDown() {
        System.out.println("销毁前");
    }


}
