package com.mingqian.observer.improve;

/**
 * Created by mingqian on 2019/8/13.
 * 观察者接口，由具体观察者来实现
 */
public interface Observer {

    public void update(Double temperature, Double pressure, Double humid);
}
