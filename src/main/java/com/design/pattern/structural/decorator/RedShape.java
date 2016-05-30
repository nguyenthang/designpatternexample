package com.design.pattern.structural.decorator;

/**
 * Created by thangnguyen-imac on 5/30/16.
 */
public class RedShape extends ShapeDecorator {

    public RedShape(Shape shape) {
        super(shape);
    }

    public void draw(){
        setBorder(shape);
    }

    private void setBorder(Shape border){
        System.out.println("Border Color: Red");
    }
}
