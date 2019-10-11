package com.spring8buyStockByProxyFactoryBean.service;

public interface IBuyStockService {
    public void openAccount(String name, double balance);
    public void openStock(String name, int amount);

    public void buyStock(String aname, double balance, String sname, int amount) throws BuyStockException;
}
