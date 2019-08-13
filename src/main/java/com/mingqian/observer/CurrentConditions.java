package com.mingqian.observer;

/**
 * Created by mingqian on 2019/8/13.
 */
public class CurrentConditions {

    /**温度*/
    private Double temperature;

    /**气压*/
    private Double pressure;

    /**湿度*/
    private Double humid;

    public void update(Double temperature, Double pressure, Double humid){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humid = humid;
        display();
    }

    public void display(){
        System.out.println("---Today temperature: " + temperature + "---");
        System.out.println("---Today pressuer: " + pressure + "---");
        System.out.println("---Today humidit: " + humid +"---");
    }
}
