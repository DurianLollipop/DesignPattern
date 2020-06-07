package com.durianlollipop.designpattern.adapter.classadapter;

/**
 * 类适配器
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        System.out.println("将电压转换为" + dst + "伏!");
        return dst;
    }
}
