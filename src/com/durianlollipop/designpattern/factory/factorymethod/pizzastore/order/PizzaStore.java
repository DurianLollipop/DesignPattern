package com.durianlollipop.designpattern.factory.factorymethod.pizzastore.order;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String[] args) {

        System.out.println("请输入地点");
        String local = new Scanner(System.in).nextLine();

        if(local.equals("LD")){
            //伦敦口味pizza
            new LDOrderPizza();
        }else if (local.equals("BJ")){
            //北京口味pizza
        new BJOrderPizza();
        }
    }
}
