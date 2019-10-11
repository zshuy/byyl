package com.spring9buyStockByAnnotation.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void insertAccount(String name, double balance) {
        String sql = "INSERT INTO account(aname, balance) VALUES (?, ?)";
        this.getJdbcTemplate().update(sql, name, balance);
    }

    @Override
    public void updateAccount(String aname, double balance, boolean isBuy) {
        if (isBuy)
            balance = -balance;
        String sql = "UPDATE account SET balance = balance + ? WHERE aname = ?";
        this.getJdbcTemplate().update(sql, balance, aname);
    }
}
