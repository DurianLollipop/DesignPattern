package com.durianlollipop.designpattern.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {

        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了方法m1");
            }
        };

        abstractAdapter.m1();
    }
}
