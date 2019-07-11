package com.mingqian.principle.inversion.improve;

/**
 * Created by mingqian on 2019/7/11.
 * 依赖倒转:
 * 构造方法传递
 */
public class ConstructionTransfer {
    public static void main(String[] args) {
        WangPai wangPai = new WangPai();
        OpenAndCloseServiceImp openAndCloseServiceImp = new OpenAndCloseServiceImp(wangPai);
        openAndCloseServiceImp.open();
        /**
         * 运行结果:
         *      王牌电视机，打开
         */
    }
}

/**
 * 开关解耦
 */
interface OpenAndCloseService {
    //抽象方法
    void open();
}

/**
 * 电视机接口
 */
interface TV {
    //抽象方法
    void play();
}

/**
 * 开关类实现开关接口并
 * 通过构造方法依赖传递
 */
class OpenAndCloseServiceImp implements OpenAndCloseService {

    /**
     * 成员
     */
    public TV tv;

    /**
     * 构造器
     */
    public OpenAndCloseServiceImp(TV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

/**
 * 电视实现TV接口
 */
class WangPai implements TV {

    @Override
    public void play() {
        System.out.println("王牌电视机，打开");
    }
}

