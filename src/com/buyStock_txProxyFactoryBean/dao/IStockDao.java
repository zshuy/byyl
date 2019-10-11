package com.buyStock_txProxyFactoryBean.dao;

public interface IStockDao {
    void insert(String sname, int amount);

    void updateStock(String sname, int amount, boolean isBuy);
}
