package com.mingqian.strategy.improve;

/**
 * Created by mingqian on 2019/8/20.
 */
public class GoodFlyBehavior implements FlyBehavior {
    /**
     * 子类具体实现
     */
    @Override
    public void fly() {
        System.out.println("飞翔技术高超");
    }
}
