package com.spring3di.di09;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01() {
        //创建容器对象
        String resource = "com/spring3di/di09/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Student student = (Student)ac.getBean("myStudent");
        Person person = (Person)ac.getBean("myPerson");
        System.out.println(student);
        System.out.println(person);
    }
}
