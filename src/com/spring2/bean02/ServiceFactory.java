package com.spring2.bean02;

public class ServiceFactory {
    public ISomeService getSomeService() {
        return new SomeServiceImpl();
    }

    public static ISomeService getStaticSomeService(){
        return new SomeServiceImpl();
    }
}
