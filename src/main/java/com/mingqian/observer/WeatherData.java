package com.mingqian.observer;

/**
 * Created by mingqian on 2019/8/13.
 * 天气数据类
 * 类是核心:
 *      1. 包含最新的天气情况信息
 *      2. 含有CurrentConditions对象
 *      3. 当数据有更新时，就主动调用CurrentConditions对象update方法含(display),
 *         这样他们(接入方)就看到最新的信息
 */
public class WeatherData {

    /**温度*/
    private Double temperature;

    /**气压*/
    private Double pressure;

    /**湿度*/
    private Double humid;

    /**聚合*/
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getHumidity() {
        return humid;
    }

    /**
     * 调用接入方的update
     */
    public void dataChange(){
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

    /**
     * 当数据有更新的时候，就调用setData
     * @param temperature
     * @param pressure
     * @param humid
     */
    public void setData(Double temperature, Double pressure, Double humid){
       this.temperature = temperature;
       this.pressure = pressure;
       this.humid = humid;
       dataChange();//调用dataChange，将最新的信息推送给接入方currentConditions
    }
}
