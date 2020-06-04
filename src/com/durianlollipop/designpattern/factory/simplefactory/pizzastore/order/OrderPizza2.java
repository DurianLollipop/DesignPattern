package com.durianlollipop.designpattern.factory.simplefactory.pizzastore.order;

import com.durianlollipop.designpattern.factory.simplefactory.pizzastore.pizz.Pizza;

import java.util.Scanner;

public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";

    public OrderPizza2() {
        do {
            System.out.println("请输入要订购的Pizza种类：");
            orderType = new Scanner(System.in).nextLine();
            pizza = SimpleFactory.createPizza2(orderType);

            //输出pizza
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            }else {
                System.out.println("订购披萨失败");
                break;
            }
        }while (true);

    }

}
