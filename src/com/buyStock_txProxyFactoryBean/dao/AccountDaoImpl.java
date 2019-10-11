package com.buyStock_txProxyFactoryBean.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    @Override
    public void insert(String aname, double money) {
        String sql="insert into account(aname,balance) value (?,?)";
        this.getJdbcTemplate().update(sql,aname,money);
    }

    @Override
    public void  updateAccount(String aname, double money, boolean isBuy) {
        if(isBuy==false)money=-money;
        String sql="update account set balance=balance-? where aname=?";
        this.getJdbcTemplate().update(sql,money,aname);
    }
}
