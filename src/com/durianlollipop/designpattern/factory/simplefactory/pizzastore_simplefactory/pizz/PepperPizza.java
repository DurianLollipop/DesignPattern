package com.durianlollipop.designpattern.factory.simplefactory.pizzastore_simplefactory.pizz;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }
}
