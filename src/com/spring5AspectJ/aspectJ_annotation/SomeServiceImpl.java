package com.spring5AspectJ.aspectJ_annotation;

public class SomeServiceImpl implements ISomeService {
    @Override
    public void doFirst() {
        System.out.println("执行doFirst");
    }

    @Override
    public String doSecond() {
        System.out.println("执行doSecond");
        return "result";
    }

    @Override
    public void doThird() throws UserException {
        System.out.println("执行doThird");
        throw new UsernameException("username");
//        throw new PasswordException("password");
    }
}
