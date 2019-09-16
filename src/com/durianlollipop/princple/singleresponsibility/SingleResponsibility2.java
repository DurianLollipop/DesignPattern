package com.durianlollipop.princple.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

//方案二分析
//遵守单一职责原则
//但是这样做的改动很大，即将类分解，又要修改客户端
//改进：直接修改Verhicle类，改动的代码会比较少 => 方案3
class RoadVehicle{
    public void run(String vericle){
        System.out.println(vericle + "在公路上运行！！！！");
    }
}

class AirVehicle{
    public void run(String vericle){
        System.out.println(vericle + "在天上运行！！！！");
    }
}

class WaterVehicle{
    public void run(String vericle){
        System.out.println(vericle + "在公路上运行！！！！");
    }
}