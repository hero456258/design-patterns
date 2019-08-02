package com.mingqian.facade;

/**
 * Created by mingqian on 2019/8/2.
 * 爆米花
 */
public class Popcorn {

    private static  Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return  instance;
    }

    public void on(){
        System.out.println("爆米花机开");
    }

    public void off(){
        System.out.println("爆米花机关");
    }
    public void pop(){
        System.out.println("爆米花在爆");
    }
    private Popcorn(){

    }
}
