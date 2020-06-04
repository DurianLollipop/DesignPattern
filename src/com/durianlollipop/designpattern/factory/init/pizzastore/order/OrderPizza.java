package com.durianlollipop.designpattern.factory.init.pizzastore.order;

import com.durianlollipop.designpattern.factory.init.pizzastore.pizz.CheesePizza;
import com.durianlollipop.designpattern.factory.init.pizzastore.pizz.PepperPizza;
import com.durianlollipop.designpattern.factory.init.pizzastore.pizz.Pizza;

import java.util.Scanner;

public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        //订购Pizza的类型
        String orderType;
        do{
            System.out.println("请输入Pizza的种类:");
            orderType = new Scanner(System.in).nextLine();
            if(orderType.equals("greek")){
                pizza = new CheesePizza();
                pizza.setName(" 希腊披萨 ");
            }else if (orderType.equals("chesse")){
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
            }else if (orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName(" 胡椒披萨 ");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);

    }

}
