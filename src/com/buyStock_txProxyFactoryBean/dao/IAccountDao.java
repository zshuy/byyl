package com.buyStock_txProxyFactoryBean.dao;

public interface IAccountDao {
    void insert(String aname, double money);

    void updateAccount(String aname, double money, boolean isBuy);
}
