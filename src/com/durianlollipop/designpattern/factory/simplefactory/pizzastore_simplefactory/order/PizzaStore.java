package com.durianlollipop.designpattern.factory.simplefactory.pizzastore_simplefactory.order;

public class PizzaStore {
    public static void main(String[] args) {

        //简单工厂模式
//        new OrderPizza(new SimpleFactory());

        //简单工厂模式-静态方法
        new OrderPizza2();
        System.out.println("~~退出了程序~~");
    }
}
