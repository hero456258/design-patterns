package com.mingqian.adapter;

/**
 * Create by mingqian on 2019/7/28.
 * 手机
 */
public class Phone {

    /**
     * 充电方法
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V) {

        if (iVoltage5V.output5V() == 5) {
            System.out.println("转换后电压为5V，可以充电-");
        } else {
            System.out.println("转换后电压不为5V，不能充电-");
        }
    }
}
