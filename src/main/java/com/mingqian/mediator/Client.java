package com.mingqian.mediator;

/**
 * Created by mingqian on 2019/8/14.
 */
public class Client {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建闹钟同事对象实例
        Alarm alarm = new Alarm(mediator,"alarm");

        //创建咖啡机同事对象实例
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,"coffeeMachine");

        //创建窗帘同事实例
        Colleague curtains = new Curtains(mediator,"curtains");

        TV tv = new TV(mediator,"TV");

        alarm.sendMessage(0);
        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);

        /**
         * It's time to startCoffee!
         * It's time to StartTv!
         * After 5 minutes!
         * Coffee is OK!
         * I am holding Up Curtains!
         * TV Stop!
         */


    }
}
