package com.spring2.bean03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01() {
        //创建容器对象
        String resource = "com/spring2/bean03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService service = (ISomeService) ac.getBean("myService");
        ISomeService service2 = (ISomeService) ac.getBean("myService2");
        System.out.println("-service:doSome-" + service.doSome() + "  doOther-" + service.doOther());
        System.out.println("-service2:doSome-" + service2.doSome() + "  doOther-" + service2.doOther());
    }

    @Test
    public void test02() {
        //创建容器对象
        String resource = "com/spring2/bean03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService service = (ISomeService) ac.getBean("myService");
        System.out.println("-service:doSome-" + service.doSome() + "  doOther-" + service.doOther());
        ((ClassPathXmlApplicationContext) ac).close();
    }
}
