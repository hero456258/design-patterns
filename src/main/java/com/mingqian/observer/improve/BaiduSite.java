package com.mingqian.observer.improve;

/**
 * Created by mingqian on 2019/8/13.
 */
public class BaiduSite implements Observer {

    /**温度*/
    private Double temperature;

    /**气压*/
    private Double pressure;

    /**湿度*/
    private Double humid;

    @Override
    public void update(Double temperature, Double pressure, Double humid) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humid = humid;
        display();
    }

    public void display(){
        System.out.println("---百度 temperature: " + temperature + "---");
        System.out.println("---百度 pressuer: " + pressure + "---");
        System.out.println("---百度 humidit: " + humid +"---");
    }
}
