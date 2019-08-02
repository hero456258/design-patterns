package com.mingqian.facade;

/**
 * Created by mingqian on 2019/8/2.
 */
public class Client {
    public static void main(String[] args) {

        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.ready();
        facade.play();
        facade.end();
        /**
         * 运行结果：
         *      爆米花机开
         *      爆米花在爆
         *      屏幕下降
         *      投影仪开
         *      立体音响开
         *      dvd开
         *      剧场灯光调暗
         *      dvd播放
         *      爆米花机关
         *      剧场灯光调亮
         *      屏幕上升
         *      投影机关
         *      立体音响关
         *      dvd关
         */
    }
}
