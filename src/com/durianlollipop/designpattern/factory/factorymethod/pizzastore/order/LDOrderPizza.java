package com.durianlollipop.designpattern.factory.factorymethod.pizzastore.order;

import com.durianlollipop.designpattern.factory.factorymethod.pizzastore.pizz.LDCheesePizza;
import com.durianlollipop.designpattern.factory.factorymethod.pizzastore.pizz.LDPepperPizza;
import com.durianlollipop.designpattern.factory.factorymethod.pizzastore.pizz.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("chesse")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
