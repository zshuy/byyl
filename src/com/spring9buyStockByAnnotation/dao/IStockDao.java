package com.spring9buyStockByAnnotation.dao;

public interface IStockDao {
    void insertStock(String name, int amount);

    void updateStock(String sname, int amount, boolean isBuy);
}
