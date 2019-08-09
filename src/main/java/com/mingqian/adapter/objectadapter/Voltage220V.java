package com.mingqian.adapter.objectadapter;


/**
* Create by mingqian on 2019/7/28.
* 被适配的类
*/
public class Voltage220V {


    /**
     * 输出220V的电压
     *
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("标准电压 = " + src + "伏");
        return src;
    }
}