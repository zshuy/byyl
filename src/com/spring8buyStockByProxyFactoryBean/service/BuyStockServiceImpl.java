package com.spring8buyStockByProxyFactoryBean.service;

import com.spring8buyStockByProxyFactoryBean.dao.IAccountDao;
import com.spring8buyStockByProxyFactoryBean.dao.IStockDao;

public class BuyStockServiceImpl implements IBuyStockService {
    private IAccountDao adao;
    private IStockDao sdao;

    public void setAdao(IAccountDao adao) {
        this.adao = adao;
    }

    public void setSdao(IStockDao sdao) {
        this.sdao = sdao;
    }

    @Override
    public void openAccount(String name, double balance) {
        adao.insertAccount(name, balance);
    }

    @Override
    public void openStock(String name, int amount) {
        sdao.insertStock(name, amount);
    }

    @Override
    public void buyStock(String aname, double balance, String sname, int amount) throws BuyStockException {
        boolean isBuy = true;
        adao.updateAccount(aname, balance, isBuy);
        if (1 == 1) {
            throw new BuyStockException("购买股票异常");
        }
        sdao.updateStock(sname, amount, isBuy);
    }
}
