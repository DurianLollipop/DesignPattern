package com.durianlollipop.designpattern.adapter.objectadapter;

public class Phone {

    void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5){
            System.out.println("电压适合，正在充电");
        }else {
            System.out.println("电压过高，不能进行充电");
        }
    }

}
