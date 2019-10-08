package com.durianlollipop.designpattern.factory.simplefactory.pizzastore_simplefactory.order;

import com.durianlollipop.designpattern.factory.simplefactory.pizzastore_simplefactory.pizz.CheesePizza;
import com.durianlollipop.designpattern.factory.simplefactory.pizzastore_simplefactory.pizz.PepperPizza;
import com.durianlollipop.designpattern.factory.simplefactory.pizzastore_simplefactory.pizz.Pizza;

//简单工厂类
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");

        Pizza pizza = null;
        //订购Pizza的类型
        System.out.println("请输入Pizza的种类:");
        if (orderType.equals("greek")) {
            pizza = new CheesePizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("chesse")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }
        return pizza;
    }

    public static Pizza createPizza2(String orderType) {
        System.out.println("使用简单工厂模式2-静态方法");

        Pizza pizza = null;
        //订购Pizza的类型
        System.out.println("请输入Pizza的种类:");
        if (orderType.equals("greek")) {
            pizza = new CheesePizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("chesse")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }
        return pizza;
    }

}
