package com.spring4aop.aop11;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01() {
        //创建容器对象
        String resource = "com/spring4aop/aop11/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService service = (ISomeService)ac.getBean("serviceProxy");
        service.doFirst();
        System.out.println("===============");
        service.doSecond();
        System.out.println("===============");
        service.doThird();

    }
}
