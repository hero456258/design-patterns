package com.mingqian.observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingqian on 2019/8/13.
 */
public class WeatherData implements Subject {

    /**
     * 温度
     */
    private Double temperature;

    /**
     * 气压
     */
    private Double pressure;

    /**
     * 湿度
     */
    private Double humid;

    /**
     * 聚合
     */
    private List<Observer> servers;

    /**
     * 加入新的第三方
     */
    public WeatherData() {
        servers = new ArrayList<>();
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getHumid() {
        return humid;
    }

    public void dataChange() {
        //调用接入方的 update
        notifyObservers();
    }

    /**
     * 当数据有更新时，就调用 setData
     * @param temperature
     * @param pressure
     * @param humid
     */
    public void setData(Double temperature, Double pressure, Double humid){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humid = humid;
        //调用dataChange， 将最新的信息 推送给 接入方
        dataChange();
    }

    /**
     * 注册一个观察者
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        servers.add(observer);
    }

    /**
     * 移除一个观察者
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        if(servers.contains(observer)){
            servers.remove(observer);
        }
    }

    /**
     * 遍历所有的观察者，并通知
     */
    @Override
    public void notifyObservers() {
        for (Observer server : servers) {
            server.update(this.temperature,this.pressure,this.humid);
        }
    }
}
