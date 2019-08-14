package com.mingqian.mediator;

/**
 * Created by mingqian on 2019/8/14.
 * 中介者抽象类
 */
public abstract class Mediator {

    /**
     * 将中介同事对象，加入到集合
     * @param colleagueName
     * @param colleague
     */
    public abstract void register(String colleagueName,Colleague colleague);

    /**
     * 接收消息，具体的同事对象发出
     * @param state
     * @param colleagueName
     */
    public abstract void getMessage(int state, String colleagueName);

    public abstract void sendMessage();
}
