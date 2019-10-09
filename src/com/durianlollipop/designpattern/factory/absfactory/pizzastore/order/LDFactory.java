package com.durianlollipop.designpattern.factory.absfactory.pizzastore.order;

import com.durianlollipop.designpattern.factory.absfactory.pizzastore.pizz.LDCheesePizza;
import com.durianlollipop.designpattern.factory.absfactory.pizzastore.pizz.LDPepperPizza;
import com.durianlollipop.designpattern.factory.absfactory.pizzastore.pizz.Pizza;

public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("chesse")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
