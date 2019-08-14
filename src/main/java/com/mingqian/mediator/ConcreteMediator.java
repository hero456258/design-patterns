package com.mingqian.mediator;

import java.util.HashMap;

/**
 * Created by mingqian on 2019/8/14.
 * 具体的中介者类
 */
public class ConcreteMediator extends Mediator{

    private HashMap<String,Colleague> colleagueHashMap;

    private HashMap<String,String> interMap;

    public ConcreteMediator() {
        colleagueHashMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    /**
     * 将中介同事对象，加入到集合
     *
     * @param colleagueName
     * @param colleague
     */
    @Override
    public void register(String colleagueName, Colleague colleague) {

        colleagueHashMap.put(colleagueName,colleague);

        if (colleague instanceof Alarm){
            interMap.put("Alarm",colleagueName);
        }

        if (colleague instanceof CoffeeMachine){
            interMap.put("CoffeeMachine",colleagueName);
        }

        if (colleague instanceof TV){
            interMap.put("TV",colleagueName);
        }

        if (colleague instanceof Curtains ){
            interMap.put("Curtains",colleagueName);
        }

    }

    /**
     * 具体中介者的核心方法:
     *     1.根据得到消息，完成相应任务
     *     2.中介者在这个方法，协调各个具体
     *       同事对象，完成任务。
     * @param state
     * @param colleagueName
     */
    @Override
    public void getMessage(int state, String colleagueName) {

        //处理闹钟发出的消息
        if (colleagueHashMap.get(colleagueName) instanceof Alarm){
            if (state == 0){
                CoffeeMachine coffeeMachine = (CoffeeMachine)colleagueHashMap.get(interMap.get("CoffeeMachine"));
                coffeeMachine.startCoffee();
                TV tv = (TV)colleagueHashMap.get(interMap.get("TV"));
                tv.startTv();
            }
            if (state == 1){
                TV tv = (TV)colleagueHashMap.get(interMap.get("TV"));
                tv.stopTv();
            }
        }

        if (colleagueHashMap.get(colleagueName) instanceof CoffeeMachine){
            Curtains curtains = (Curtains)colleagueHashMap.get(interMap.get("Curtains"));
            curtains.upCurtains();
        }

        if (colleagueHashMap.get(colleagueName) instanceof TV){
            //如果是TV发出的消息在这里处理
        }

        if (colleagueHashMap.get(colleagueName) instanceof Curtains){
            //如果是窗帘发出的消息，在这里处理
        }



    }

    @Override
    public void sendMessage() {

    }
}
