package com.durianlollipop.designpattern.factory.factorymethod.pizzastore.order;

import com.durianlollipop.designpattern.factory.factorymethod.pizzastore.pizz.Pizza;

import java.util.Scanner;

public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        //订购Pizza的类型
        String orderType;
       do {
           System.out.println("请输如pizza类型：");
           orderType = new Scanner(System.in).nextLine();
           pizza = createPizza(orderType);
           if (pizza != null){
               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();
           }else {
               System.out.println("没有该口味的pizza");
           }

       }while (true);

    }

}
