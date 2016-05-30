package com.design.pattern.behavioral.command;

/**
 * Created by thangnguyen-imac on 5/30/16.
 */
public class CommandPatternDemo {

    public void main(String[] args){

        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
