package com.spring10byAspectJ.dao;

public interface IStockDao {
    void insertStock(String name, int amount);

    void updateStock(String sname, int amount, boolean isBuy);
}
