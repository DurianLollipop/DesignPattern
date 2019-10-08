package com.durianlollipop.designpattern.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode" + singleton1.hashCode());
        System.out.println("singleton2.hashCode" + singleton2.hashCode());
    }
}

/**
 * 懒汉式（线程不安全）
 */
class Singleton{

    // 2.本类内部创建对象实例
    private static Singleton instance;

    // 1.私有化构造函数，外部不能new
    private Singleton(){}

    // 3.提供公共的静态方法，当使用到该方法时，才去创建对象实例
    public static Singleton getInstance(){
        //判断该静态变量是否有对象，没有则创建，有则直接返回
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}