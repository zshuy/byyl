package com.spring10byAspectJ.dao;

public interface IAccountDao {
    void insertAccount(String name, double balance);

    void updateAccount(String aname, double balance, boolean isBuy);
}
