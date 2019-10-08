package com.durianlollipop.designpattern.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode" + singleton1.hashCode());
        System.out.println("singleton2.hashCode" + singleton2.hashCode());
    }
}

/**
 * 饿汉式（静态代码块）
 */
class Singleton{

    // 2.本类内部创建对象实例
    private final static Singleton instance;

    // 1.私有化构造函数，外部不能new
    private Singleton(){}

    static{
        //在静态代码块中创建单例对象实例
        instance = new Singleton();
    }

    // 3.提供公共的静态方法，返回对象实例
    public static Singleton getInstance(){
        return instance;
    }
}