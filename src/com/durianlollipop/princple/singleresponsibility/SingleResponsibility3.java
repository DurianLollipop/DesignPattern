package com.durianlollipop.princple.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runRoad("摩托车");
        vehicle.runWater("轮船");
        vehicle.runAir("飞机");
    }
}

//方式三的分析
//1。这种修改方法没有对原来的类进行大的修改，只是增加了方法
//2。这里虽然没有在类上遵守单一制则原则，但是在方法上遵守了单一指责原则
class Vehicle2 {
    public void runRoad(String vericle) {
        System.out.println(vericle + "在公路上运行！！！！");
    }

    public void runAir(String vericle) {
        System.out.println(vericle + "在天上运行！！！！");
    }

    public void runWater(String vericle) {
        System.out.println(vericle + "在水上运行！！！！");
    }
}