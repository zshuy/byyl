package com.spring5AspectJ.aspectJ_annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        String resource = "com/spring5AspectJ/aspectJ_annotation/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);

        ISomeService service = (ISomeService)ac.getBean("someService");
        service.doFirst();
        System.out.println("================");
        service.doSecond();
        System.out.println("================");
        try {
            service.doThird();
        } catch (UserException e) {

        }
    }
}
