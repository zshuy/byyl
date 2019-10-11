package com.spring9buyStockByAnnotation.dao;

public interface IAccountDao {
    void insertAccount(String name, double balance);

    void updateAccount(String aname, double balance, boolean isBuy);
}
