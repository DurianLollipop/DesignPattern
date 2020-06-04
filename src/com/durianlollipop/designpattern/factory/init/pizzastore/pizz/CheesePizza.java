package com.durianlollipop.designpattern.factory.init.pizzastore.pizz;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给奶酪披萨 准备原材料 ");
    }
}
