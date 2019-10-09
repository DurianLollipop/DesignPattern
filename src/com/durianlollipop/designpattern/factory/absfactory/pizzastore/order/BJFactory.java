package com.durianlollipop.designpattern.factory.absfactory.pizzastore.order;

import com.durianlollipop.designpattern.factory.absfactory.pizzastore.pizz.BJCheesePizza;
import com.durianlollipop.designpattern.factory.absfactory.pizzastore.pizz.BJPepperPizza;
import com.durianlollipop.designpattern.factory.absfactory.pizzastore.pizz.Pizza;

public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("chesse")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
