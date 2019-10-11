package com.spring4aop.aop01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01() {
        //创建容器对象
        String resource = "com/spring4aop/aop01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService service = (SomeServiceImpl)ac.getBean("myService");
        service.doFirst();
        System.out.println("===============");
        service.doSecond();
    }
}
