package com.buyStock_txProxyFactoryBean.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StockDaoImpl extends JdbcDaoSupport implements IStockDao {
    @Override
    public void insert(String sname, int amount) {
        String sql="insert into stock(sname,count) value (?,?)";
        this.getJdbcTemplate().update(sql,sname,amount);
    }

    @Override
    public void updateStock(String sname, int amount, boolean isBuy) {
        if(isBuy==false)amount=-amount;
        String sql="update stock set count=count+? where sname=?";
        this.getJdbcTemplate().update(sql,amount,sname);
    }
}
