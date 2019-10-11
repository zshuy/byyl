package com.spring7buyStock.beans;

public class Stock {
    private Integer sid;
    private String sname;
    private int amount;

    public Stock() {
    }

    public Stock(String sname, int amount) {
        this.sname = sname;
        this.amount = amount;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getCount() {
        return amount;
    }

    public void setCount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", amount=" + amount +
                '}';
    }
}
