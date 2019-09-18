package com.durianlollipop.princple.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("3 - 5 = " + a.func1(3,5));
        System.out.println("9 - 2 = " + a.func1(9,2));

        System.out.println("------------------------------");

        B b = new B();
        System.out.println("3 - 5 =" + b.func1(3,5));
        System.out.println("9 - 2 =" + b.func1(9,2));
        System.out.println("3 - 5 + 9=" + b.func2(3,5));
    }
}

class A {
    //返回两个数的差
    public int func1(int a, int b) {
        return a - b;
    }
}

class B extends A {
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a,b) + 9;
    }
}