package com.mingqian.strategy.improve;

/**
 * Created by mingqian on 2019/8/20.
 */
public abstract class Duck {

    /**属性策略接口*/
    FlyBehavior flyBehavior;

    /**其他属性<->策略接口*/
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * 显示鸭子信息
     */
    public abstract void display();

    public void quack(){
        if (quackBehavior != null){
            quackBehavior.quack();
        }
    }

    public void swim(){
        System.out.println("鸭子会游泳.......");
    }

    public void fly(){
        //改进
        if (flyBehavior != null){
            flyBehavior.fly();
        }
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
