package com.spring8buyStockByProxyFactoryBean.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void insertAccount(String name, double balance) {
        String sql = "INSERT INTO account(aname, balance) VALUES (?, ?)";
        this.getJdbcTemplate().update(sql, name, balance);
    }

    @Override
    public void updateAccount(String aname, double balance, boolean isBuy) {
        String sql = "UPDATE account SET balance = balance + ? WHERE aname = ?";
        if (isBuy) {
            sql =  "UPDATE account SET balance = balance - ? WHERE aname = ?";
        }
        this.getJdbcTemplate().update(sql, balance, aname);
    }
}
