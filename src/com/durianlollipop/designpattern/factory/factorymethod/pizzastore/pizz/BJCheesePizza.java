package com.durianlollipop.designpattern.factory.factorymethod.pizzastore.pizz;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println(" 给北京奶酪披萨 准备原材料 ");
    }
}
