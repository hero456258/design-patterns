package com.mingqian.observer;

/**
 * Created by mingqian on 2019/8/13.
 */
public class Client {
    public static void main(String[] args) {

        //创建接入方 currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        //创建 WeatherData 并将 接入方 currentConditions 传递到 WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);

        System.out.println("============天气情况变化=============");
        //更新天气情况
        weatherData.setData(25.5, 36.3, 78.5);

        /**
         * 运行结果：
         *     ============天气情况变化=============
         *     ---Today temperature: 25.5---
         *     ---Today pressure: 36.3---
         *     ---Today humid: 78.5---
         */
    }
}
