package com.durianlollipop.designpattern.factory.simplefactory.pizzastore.order;

import com.durianlollipop.designpattern.factory.simplefactory.pizzastore.pizz.Pizza;

import java.util.Scanner;

public class OrderPizza {

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;

        do {
            System.out.println("请输入要订购的Pizza种类：");
            orderType = new Scanner(System.in).nextLine();
            pizza = this.simpleFactory.createPizza(orderType);

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
