package com.durianlollipop.designpattern.factory.simplefactory.pizzastore_simplefactory.pizz;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
