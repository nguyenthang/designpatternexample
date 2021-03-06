package com.design.pattern.behavioral.command;

/**
 * Created by thangnguyen-imac on 5/29/16.
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
