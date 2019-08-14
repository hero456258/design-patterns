package com.mingqian.mediator;

/**
 * Created by mingqian on 2019/8/14.
 * 咖啡机(具体对象同事类)
 */
public class CoffeeMachine extends Colleague{

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state,this.name);
    }

    public void startCoffee(){
        System.out.println("It's time to startCoffee!");
    }

    public void finishCoffee(){
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is OK!");
        sendMessage(0);
    }
}
