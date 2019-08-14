package com.mingqian.mediator;

/**
 * Created by mingqian on 2019/8/14.
 * 电视(具体同事对象)
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state,this.name);
    }

    public void startTv(){
        System.out.println("It's time to StartTv!");
    }

    public void stopTv(){
        System.out.println("TV Stop!");
    }
}
