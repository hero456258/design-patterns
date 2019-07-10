package com.mingqian.principle.singleresponsibility;

/**
 * Created by mingqian on 2019/7/10.
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.roadRun("摩托车");
        vehicle.airRun("飞机");
        vehicle.waterRun("轮船");
    }
}

/**
 * 方案三分析：
 * 1. 这种修改方法没有对原来的类做很大的修改，只是增加方法
 * 2. 这种虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然遵守单一职责
 */
class Vehicle2 {

    public void roadRun(String vehicle) {
        //其他的业务逻辑
        System.out.println(vehicle + "在公路上运行.........");
    }

    public void airRun(String vehicle) {
        System.out.println(vehicle + "在天空中飞行.........");
    }

    public void waterRun(String vehicle) {
        System.out.println(vehicle + "在水里运行........");
    }
}
