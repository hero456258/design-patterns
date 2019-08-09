package com.mingqian.facade;

/**
 * Created by mingqian on 2019/8/2.
 * 投影仪
 */
public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("投影仪开");
    }

    public void off(){
        System.out.println("投影机关");
    }

    public void focus(){
        System.out.println("投影聚焦");
    }

    private Projector(){

    }
}
