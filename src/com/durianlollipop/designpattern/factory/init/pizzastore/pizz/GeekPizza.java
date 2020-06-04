package com.durianlollipop.designpattern.factory.init.pizzastore.pizz;

public class GeekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
