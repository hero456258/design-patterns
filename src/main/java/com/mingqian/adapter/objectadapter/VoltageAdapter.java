package com.mingqian.adapter.objectadapter;


/**
* Create by mingqian on 2019/7/28.
* 适配器类
*/
public class VoltageAdapter implements IVoltage5V {

    /**
     * 关联关系-聚合
     */
    private Voltage220V voltage220V;

    /**
     * 通过构造器，传入一个voltage220V的实例
     *
     * @param voltage220V
     */
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {

        int dstV = 0;

        if (voltage220V != null) {
            int srcV = voltage220V.output220V(); //获取220v电压
            System.out.println("使用对象适配器，进行适配--");

            dstV = srcV / 44; //把220V的电转换成5V的电
            System.out.println("适配完成，输出的电压为= " + dstV);

        }


        return dstV;
    }
}