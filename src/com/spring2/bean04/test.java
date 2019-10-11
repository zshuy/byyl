package com.spring2.bean04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01() {
        //创建容器对象
        String resource = "com/spring2/bean04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService service = (ISomeService) ac.getBean("myService");
        service.doSome();
        ((ClassPathXmlApplicationContext) ac).close();
    }
}
