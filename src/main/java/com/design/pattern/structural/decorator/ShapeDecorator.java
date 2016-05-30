package com.design.pattern.structural.decorator;

/**
 * Created by thangnguyen-imac on 5/30/16.
 */
public class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }


    @Override
    public void draw() {
        shape.draw();
    }
}
