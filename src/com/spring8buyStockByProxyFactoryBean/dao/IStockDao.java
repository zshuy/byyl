package com.spring8buyStockByProxyFactoryBean.dao;

public interface IStockDao {
    void insertStock(String name, int amount);

    void updateStock(String sname, int amount, boolean isBuy);
}
