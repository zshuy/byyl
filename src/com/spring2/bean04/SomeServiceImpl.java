package com.spring2.bean04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class SomeServiceImpl implements ISomeService, BeanNameAware,
        BeanFactoryAware, InitializingBean, DisposableBean {
    private String aDao;

    public SomeServiceImpl() {
        System.out.println("Step1:构造方法");
    }

    public void setaDao(String aDao) {
        this.aDao = aDao;
        System.out.println("Step2:执行setter");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Step3:获取beanID:" + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Step4:获取beanFactory容器");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Step6:bean初始化完毕");
    }

    @Override
    public void doSome() {
        System.out.println("Step9:执行doSome()方法");
    }

    @Override
    public void setUp() {
        System.out.println("Step7:初始化完毕之后");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Step10:实现接口的销毁之前");
    }

    @Override
    public void tearDown() {
        System.out.println("Step11:销毁之前");
    }
}
