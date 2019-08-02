package com.mingqian.facade;


/**
 * Created by mingqian on 2019/8/2.
 */
public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd开");
    }

    public void off(){
        System.out.println("dvd关");
    }

    public void play(){
        System.out.println("dvd播放");
    }

    public void pause(){
        System.out.println("dvd暂停");
    }

    private DVDPlayer(){

    }


}
