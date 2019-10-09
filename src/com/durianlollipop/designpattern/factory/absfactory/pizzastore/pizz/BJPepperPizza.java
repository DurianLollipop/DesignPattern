package com.durianlollipop.designpattern.factory.absfactory.pizzastore.pizz;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
       setName("北京胡椒披");
        System.out.println(" 给北京胡椒披萨准备原材料 ");
    }
}
