package com.durianlollipop.designpattern.factory.factorymethod.pizzastore.order;

import com.durianlollipop.designpattern.factory.factorymethod.pizzastore.pizz.BJCheesePizza;
import com.durianlollipop.designpattern.factory.factorymethod.pizzastore.pizz.BJPepperPizza;
import com.durianlollipop.designpattern.factory.factorymethod.pizzastore.pizz.Pizza;

public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("chesse")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
