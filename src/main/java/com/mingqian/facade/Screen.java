package com.mingqian.facade;

/**
 * Created by mingqian on 2019/8/2.
 * 屏幕
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("屏幕上升");
    }

    public void down(){
        System.out.println("屏幕下降");
    }

    private Screen(){

    }
}
