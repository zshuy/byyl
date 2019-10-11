package com.spring4aop.aop12;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01() {
        //创建容器对象
        String resource = "com/spring4aop/aop12/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService service = (ISomeService)ac.getBean("someService");
        ISomeService service2 = (ISomeService)ac.getBean("someService2");
        service.doFirst();
        System.out.println("===============");
        service.doSecond();
        System.out.println("===============");
        service.doThird();
        System.out.println("-------------------------------");
        service2.doFirst();
        System.out.println("===============");
        service2.doSecond();
        System.out.println("===============");
        service2.doThird();

    }
}
