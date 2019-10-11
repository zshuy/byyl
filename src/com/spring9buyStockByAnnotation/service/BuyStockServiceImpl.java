package com.spring9buyStockByAnnotation.service;

import com.spring9buyStockByAnnotation.dao.IAccountDao;
import com.spring9buyStockByAnnotation.dao.IStockDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BuyStockServiceImpl implements IBuyStockService {
    private IAccountDao adao;
    private IStockDao sdao;

    public void setAdao(IAccountDao adao) {
        this.adao = adao;
    }

    public void setSdao(IStockDao sdao) {
        this.sdao = sdao;
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public void openAccount(String name, double balance) {
        adao.insertAccount(name, balance);
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Override
    public void openStock(String name, int amount) {
        sdao.insertStock(name, amount);
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = BuyStockException.class)
    @Override
    public void buyStock(String aname, double money, String sname, int amount) throws BuyStockException {
        boolean isBuy =true;

        adao.updateAccount(aname,money,isBuy);
        if(1==1) throw new BuyStockException("购买股票异常");
        sdao.updateStock(sname,amount,isBuy);
    }
}
