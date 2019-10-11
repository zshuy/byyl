package com.spring2.bean03;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("-:BEFORE");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("-:After");
        if ("myService".equals(s)) {
            return Proxy.newProxyInstance(
                    o.getClass().getClassLoader(),
                    o.getClass().getInterfaces(),
                    (proxy, method, args) -> {
                        Object invoke = method.invoke(o, args);
                        if ("doSome".equals(method.getName())) {
                            return ((String) invoke).toUpperCase();
                        } else {
                            return invoke;
                        }
                    }
            );
        } else {
            return Proxy.newProxyInstance(
                    o.getClass().getClassLoader(),
                    o.getClass().getInterfaces(),
                    (proxy, method, args) -> {
                        Object invoke = method.invoke(o, args);
                        if("doOther".equals(method.getName())) {
                            return ((String) invoke).toUpperCase();
                        } else {
                            return invoke;
                        }
                    }
            );
        }
    }
}
