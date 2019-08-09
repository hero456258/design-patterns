package com.mingqian.facade;

/**
 * Created by mingqian on 2019/8/2.
 * 立体音响
 */
public class Stereo {

    private  static  Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("立体音响开");
    }

    public void off(){
        System.out.println("立体音响关");
    }

    private Stereo(){

    }
}
