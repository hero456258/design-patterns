package com.mingqian.observer.improve;

/**
 * Created by mingqian on 2019/8/13.
 */
public class CurrentConditions implements Observer {

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
        System.out.println("---Today temperature: " + temperature + "---");
        System.out.println("---Today pressuer: " + pressure + "---");
        System.out.println("---Today humidit: " + humid +"---");
    }
}
