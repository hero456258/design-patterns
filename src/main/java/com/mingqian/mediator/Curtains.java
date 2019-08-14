package com.mingqian.mediator;

/**
 * Created by mingqian on 2019/8/14.
 * 窗帘(具体同事对象类)
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state,this.name);
    }

    public void upCurtains(){
        System.out.println("I am holding Up Curtains!");
    }
}
