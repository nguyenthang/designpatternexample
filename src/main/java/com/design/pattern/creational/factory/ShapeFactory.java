package com.design.pattern.creational.factory;

/**
 * Created by thangnguyen-imac on 5/30/16.
 */
public class ShapeFactory {

    private Shape shape;

    public ShapeFactory(Shape shape){
        this.shape = shape;
    }

    public Shape getShape(String name){

        if(name == null){
            return null;
        }

        if(name.equals(ShapeEnum.CIRCLE)){
            return new Circle();
        }

        return null;
    }
}
