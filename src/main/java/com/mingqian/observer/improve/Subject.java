package com.mingqian.observer.improve;

/**
 * Created by mingqian on 2019/8/13.
 * 接口，让WeatherData 来实现
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
