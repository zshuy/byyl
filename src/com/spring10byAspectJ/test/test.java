package com.spring10byAspectJ.test;

import com.spring10byAspectJ.service.BuyStockException;
import com.spring10byAspectJ.service.IBuyStockService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    IBuyStockService service = null;

    @Before
    public void before() {
        String resource = "com/spring10byAspectJ/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        service = (IBuyStockService) ac.getBean("buyStockService");
    }

    @Test
    public void test01() {
        service.openAccount("张三", 10000);
        service.openStock("西邮", 0);
    }

    @Test
    public void test02() throws BuyStockException {
        service.buyStock("张三", 2000, "西邮", 5);
    }

}
