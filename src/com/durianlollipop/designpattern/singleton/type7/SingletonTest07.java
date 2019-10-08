package com.durianlollipop.designpattern.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode" + singleton1.hashCode());
        System.out.println("singleton2.hashCode" + singleton2.hashCode());
    }
}

/**
 * 静态内部类（线程安全,延迟加载，******次推荐使用*****）
 */
class Singleton{

    // 1.私有化构造函数，外部不能new
    private Singleton(){}

    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3.提供公共的静态方法，调用方法时直接返回静态内部类的INSTANCE属性
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}