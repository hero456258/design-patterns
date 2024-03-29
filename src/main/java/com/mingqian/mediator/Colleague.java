package com.mingqian.mediator;

/**
 * Created by mingqian on 2019/8/14.
 * 同事抽象类
 */
public abstract class Colleague {

    private Mediator mediator;

    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator(){
        return this.mediator;
    }

    public abstract void sendMessage(int state);
}
