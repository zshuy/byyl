package com.spring2.bean02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01() {
        ISomeService service = new ServiceFactory().getSomeService();
        service.doSome();
    }

    @Test
    public void test02() {
        //创建容器对象
        String resource = "com/spring2/bean02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService service = (ISomeService) ac.getBean("myService");
        service.doSome();
    }

    @Test
    public void test3() {
        String resource = "com/spring2/bean02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService service = (ISomeService) ac.getBean("myService");
        service.doSome();
    }

    @Test
    public void test4() {
        String resource = "com/spring2/bean02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService service = (ISomeService) ac.getBean("myService");
        service.doSome();
    }
}
