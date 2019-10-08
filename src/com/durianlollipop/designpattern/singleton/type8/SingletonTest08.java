package com.durianlollipop.designpattern.singleton.type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode" + singleton1.hashCode());
        System.out.println("singleton2.hashCode" + singleton2.hashCode());

        singleton1.say();
        singleton2.say();
    }
}

/**
 * 枚举（单元素枚举，线程安全,防止反序列化，******次推荐使用*****）
 */
enum Singleton{
    INSTANCE;
    private String name = "张三";
    void say(){
        System.out.println(name);
    }
}