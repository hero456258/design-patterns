package com.mingqian.mediator;

/**
 * Created by mingqian on 2019/8/14.
 * 闹钟(具体的同事类)
 */
public class Alarm extends Colleague{

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm同事对象时，将自己放入到ConcreteMediator对象中(集合)
        mediator.register(name,this);
    }

    public void sendAlarm(int state){
        sendMessage(state);
    }
    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state,this.name);
    }
}
