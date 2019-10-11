package com.spring4aop.aop02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class test {
    @Test
    public void test01() {
        //创建容器对象
        String resource = "com/spring4aop/aop02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService target = (SomeServiceImpl) ac.getBean("myService");
//        ISomeService service = (ISomeService)Proxy.newProxyInstance(
//                target.getClass().getClassLoader(),
//                target.getClass().getInterfaces(),
//                //织入 weaving
//                ((proxy, method, args) -> {
//                    SystemService.doTx();
//                    Object obj = method.invoke(target, args);
//                    SystemService.doLog();
//                    return obj;
//                }));

        ISomeService service = (ISomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (((proxy, method, args) -> {
                    SystemService.doTx();
                    Object obj = method.invoke(target, args);
                    SystemService.doLog();
                    return obj;
                }))
        );
        service.doFirst();
        System.out.println("===============");
        service.doSecond();
    }
}
