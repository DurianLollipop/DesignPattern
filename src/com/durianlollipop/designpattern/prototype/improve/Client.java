package com.durianlollipop.designpattern.prototype.improve;

/**
 * 浅拷贝
 */
public class Client {
    public static void main(String[] args) {
        //羊原型
        Sheep sheep = new Sheep("Tom",1,"白色");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);

    }
}
