package com.design.pattern.behavioral.command;

/**
 * Created by thangnguyen-imac on 5/29/16.
 */
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy(){
        System.out.print("Stock [ Name " + name + "] and Quantity " + quantity + " bought.");
    }

    public void sell(){
        System.out.print("Stock [ Name " + name + "] and Quantity " + quantity + " sold.");
    }
}
