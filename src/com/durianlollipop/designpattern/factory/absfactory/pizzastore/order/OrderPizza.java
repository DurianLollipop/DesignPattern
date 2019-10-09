package com.durianlollipop.designpattern.factory.absfactory.pizzastore.order;

import com.durianlollipop.designpattern.factory.absfactory.pizzastore.pizz.Pizza;

import java.util.Scanner;

public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    private Pizza setFactory(AbsFactory factory) {
        Pizza pizza = null;
        //订购Pizza的类型
        String orderType;
       do {
           System.out.println("请输如pizza类型：");
           orderType = new Scanner(System.in).nextLine();
           pizza = factory.createPizza(orderType);
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
