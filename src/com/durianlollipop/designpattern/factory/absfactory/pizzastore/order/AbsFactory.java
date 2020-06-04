package com.durianlollipop.designpattern.factory.absfactory.pizzastore.order;

import com.durianlollipop.designpattern.factory.absfactory.pizzastore.pizz.Pizza;

/**
 * 一个抽象工厂模式的抽象层（接口）
 */
public interface AbsFactory {

    /**
     * 让下面的子类工厂 具体实现
     * @param orderType Pizza类型
     * @return 具体Pizza
     */
    Pizza createPizza(String orderType);

}
