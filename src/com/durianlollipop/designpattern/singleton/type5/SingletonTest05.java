package com.durianlollipop.designpattern.singleton.type5;

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode" + singleton1.hashCode());
        System.out.println("singleton2.hashCode" + singleton2.hashCode());
    }
}

/**
 * 懒汉式（线程安全,同步代码块，*****完全不能起到线程安全的作用******）
 */
class Singleton{

    // 2.本类内部创建对象实例
    private static Singleton instance;

    // 1.私有化构造函数，外部不能new
    private Singleton(){}

    // 3.提供公共的静态方法，
    public static Singleton getInstance(){
        //判断该静态变量是否有对象，没有则创建，有则直接返回
        if(instance == null){
            //加入同步锁，本想解决线程安全，但是可能多个线程进入if，产生多个实例，完全不能起到线程安全的作用
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}