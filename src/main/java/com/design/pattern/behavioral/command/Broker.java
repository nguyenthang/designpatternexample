package com.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thangnguyen-imac on 5/30/16.
 */
public class Broker {

    private List<Order> stockList = new ArrayList<>();


    public void takeOrder(Order order){
        stockList.add(order);
    }

    public void placeOrders(){
        for(Order o : stockList){
            o.execute();
        }

        stockList.clear();
    }

}
