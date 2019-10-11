package com.spring9buyStockByAnnotation.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StockDaoImpl extends JdbcDaoSupport implements IStockDao {
    @Override
    public void insertStock(String name, int amount) {
        String sql = "INSERT INTO stock (sname, amount) VALUES (?, ?)";
        this.getJdbcTemplate().update(sql, name, amount);
    }

    @Override
    public void updateStock(String sname, int amount, boolean isBuy) {
        if (!isBuy)
            amount = -amount;
        String sql =  "UPDATE stock SET amount = amount + ? WHERE sname = ?";
        this.getJdbcTemplate().update(sql, amount, sname);
    }
}
