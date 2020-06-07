package com.durianlollipop.designpattern.adapter.objectadapter;

import java.util.Objects;

/**
 * 对象适配器
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;

    }

    @Override
    public int output5V() {
        int dst = 0;
        if (Objects.nonNull(voltage220V)){
            int src = voltage220V.output220V();
            dst = src / 44;
            System.out.println("将电压转换为" + dst + "伏!");
        }
        return dst;
    }
}
