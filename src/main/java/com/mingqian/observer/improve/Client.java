package com.mingqian.observer.improve;

/**
 * Created by mingqian on 2019/8/13.
 */
public class Client {
    public static void main(String[] args) {

        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        //把currentConditions注册到weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        System.out.println("通知各个注册的观察者，看看信息");
        weatherData.setData(15.3,25.4,44.2);

        weatherData.removeObserver(currentConditions);

        System.out.println();
        System.out.println("通知各个注册的观察者，看看信息");
        weatherData.setData(144.4,38.3,33.25);

        /**
         * 运行结果:
         *      通知各个注册的观察者，看看信息
         *      ---Today temperature: 15.3---
         *      ---Today pressuer: 25.4---
         *      ---Today humidit: 44.2---
         *      ---百度 temperature: 15.3---
         *      ---百度 pressuer: 25.4---
         *      ---百度 humidit: 44.2---
         *
         *      通知各个注册的观察者，看看信息
         *      ---百度 temperature: 144.4---
         *      ---百度 pressuer: 38.3---
         *      ---百度 humidit: 33.25---
         */

    }
}
