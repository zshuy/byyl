package com.buyStock_txProxyFactoryBean.test;


import com.buyStock_txProxyFactoryBean.service.BuyStockException;
import com.buyStock_txProxyFactoryBean.service.IBuyStockService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
    private IBuyStockService service;
    @Before
    public void before21(){
        String resource="buyStock_txProxyFactoryBean/applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(resource);
        service=(IBuyStockService) applicationContext.getBean("serviceProxy");

    }
    @Test
    public void test01(){
        service.openAccount("张三",10000);
        service.openStock("TA",0);
    }

    @Test
    public void test02(){
        try {
            service.buyStock("张三",2000,"TA",5);
        } catch (BuyStockException e) {
            e.printStackTrace();
        }
    }




}
