package com.durianlollipop.princple.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("3 - 5 = " + a.func1(3,5));
        System.out.println("9 - 2 = " + a.func1(9,2));

        System.out.println("------------------------------");

        B b = new B();
        //因为B类不在继承A类，因此调用者，不会再以为func1是求减法
        //调用完成的功能就会很明确
        System.out.println("3 + 5 =" + b.func1(3,5));
        System.out.println("9 + 2 =" + b.func1(9,2));
        System.out.println("3 + 5 + 9=" + b.func2(3,5));

        System.out.println("9 - 8 = " + b.func3(9,8));
    }
}

//创建一个更加基础的基类
class Base{
    //把更加基础的方法和成员写到Base类中
}

class A extends Base {
    //返回两个数的差
    public int func1(int a, int b) {
        return a - b;
    }
}

class B extends Base {

    //B需要使用到A的方法，使用组合关系
    A  a = new A();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a,b) + 9;
    }

    public int func3(int a, int b) {
        return this.a.func1(a,b);
    }
}