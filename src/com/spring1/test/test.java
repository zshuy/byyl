package com.spring1.test;

import com.spring1.service.ISomeService;
import com.spring1.service.SomeServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class test {
    @Test
    public void test01() {
        ISomeService service = new SomeServiceImpl();
        service.doSome();
    }

    @Test
    public void test02() {
        //创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring1/applicationContext.xml");
        ISomeService service = (ISomeService) ac.getBean("myService");
        service.doSome();
    }

    @Test
    public void test03() {
        //创建容器对象
        ApplicationContext ac = new FileSystemXmlApplicationContext("D:/Java/Spring/src/com/spring1/spring-base.xml");
        ISomeService service = (ISomeService) ac.getBean("myService");
        service.doSome();
    }

    @Test
    public void test04() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/spring1/applicationContext.xml"));
        ISomeService service = (ISomeService)bf.getBean("myService");
        service.doSome();
    }
}
