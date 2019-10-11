package com.spring3di.di16;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component("myStudent")
public class Student{
    @Value("张三")
    private String name;
    @Value("29")
    private int age;
//    @Autowired                    //byType方式注解式注入
//    @Qualifier("mySchool")        //与Autowired联合使用   byName方式注解式注入
//    @Resource(name = "mySchool")  //byName方式注解式注入
    @Resource                       //byType方式注解式注入
    private School school;

    public void setName(String name) {
        this.name = name;
        System.out.println("Name setter()");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age setter()");
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    @PostConstruct
    public void initAfter() {
        System.out.println("当前Bean初始化完毕");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("当前Bean即将销毁");
    }
}
