package com.mingqian.adapter.objectadapter;


/**
 * Create by mingqian on 2019/7/28.
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("--对象适配器模式--");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));

        /**
         * 运行结果：
         *      --对象适配器模式--
         *      标准电压 = 220伏
         *      使用对象适配器，进行适配--
         *      适配完成，输出的电压为= 5
         *      转换后电压为5V，可以充电-
         */
    }
}
