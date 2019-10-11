package com.buyStock_txProxyFactoryBean.service;


import com.buyStock_txProxyFactoryBean.dao.IAccountDao;
import com.buyStock_txProxyFactoryBean.dao.IStockDao;

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
    public void openAccount(String aname, double money) {
        adao.insert(aname,money);
    }

    @Override
    public void openStock(String sname, int amount) {
        sdao.insert(sname,amount);
    }

    @Override
    public void buyStock(String aname, double money, String sname, int amount) throws BuyStockException {
        boolean isBuy =true;

        adao.updateAccount(aname,money,isBuy);
        if(1==1) throw new BuyStockException("购买股票异常");
        sdao.updateStock(sname,amount,isBuy);
    }
}
