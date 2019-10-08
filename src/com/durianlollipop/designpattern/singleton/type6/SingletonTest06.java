package com.durianlollipop.designpattern.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode" + singleton1.hashCode());
        System.out.println("singleton2.hashCode" + singleton2.hashCode());
    }
}

/**
 * 双重检查（线程安全,延迟加载，效率较高，******推荐使用*****）
 */
class Singleton{

    // 2.本类内部创建对象实例
    private static volatile Singleton instance;

    // 1.私有化构造函数，外部不能new
    private Singleton(){}

    // 3.提供公共的静态方法，加入双重检查，解决线程安全问题，同时解决懒加载问题
    public static Singleton getInstance(){
        //判断该静态变量是否有对象，没有则创建，有则直接返回
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}