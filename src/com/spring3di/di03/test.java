package com.spring3di.di03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01() {
        //创建容器对象
        String resource = "com/spring3di/di03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Student student = (Student)ac.getBean("myStudent");
        System.out.println(student);
    }
}
