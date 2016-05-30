package com.design.pattern.behavioral.command;

/**
 * Created by thangnguyen-imac on 5/30/16.
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
