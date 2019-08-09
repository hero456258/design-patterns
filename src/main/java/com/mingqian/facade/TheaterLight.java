package com.mingqian.facade;

/**
 * Created by mingqian on 2019/8/2.
 * 剧场灯光
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("剧场灯光开");
    }

    public void off(){
        System.out.println("剧场灯光关");
    }

    public void dim(){
        System.out.println("剧场灯光调暗");
    }

    public void bright(){
        System.out.println("剧场灯光调亮");
    }

    private TheaterLight(){

    }
}
