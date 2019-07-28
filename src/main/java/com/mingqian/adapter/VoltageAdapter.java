package com.mingqian.adapter;

/**
 * Create by mingqian on 2019/7/28.
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {

        int srcV = output220V();
        int dstV = srcV / 44; //把220V的电转换成5V的电
        return dstV;
    }
}
