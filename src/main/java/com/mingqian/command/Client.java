package com.mingqian.command;

/**
 * Created by mingqian on 2019/8/8.
 */
public class Client {
    public static void main(String[] args) {
        //使用命令模式，完成通过遥控器，对电灯的操作
        //创建电灯的接收者
        LightReceiver receiver = new LightReceiver();
        //创建电灯相关的命令
        LightOnCommand onCommand = new LightOnCommand(receiver);
        LightOffCommand offCommand = new LightOffCommand(receiver);
        //创建遥控器对象
        RemoteController controller = new RemoteController();
        //给我们的遥控器设置命令, 比如 no = 0 是电灯的开和关的操作
        controller.setCommand(0,onCommand,offCommand);
        System.out.println("--------按下灯的开按钮-----------");
        controller.onButtonWasPushed(0);
        System.out.println("--------按下灯的关按钮-----------");
        controller.offButtonWasPushed(0);
        System.out.println("--------按下撤销按钮-----------");
        controller.undoButtonWasPushed();

        System.out.println("=========使用遥控器操作电视机==========");

        //创建电视的接收者
        TVReceiver tvReceiver = new TVReceiver();
        //创建电视相关的命令
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        //给我们的遥控器设置命令, 比如 no = 1 是电视机的开和关的操作
        controller.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("--------按下电视机的开按钮-----------");
        controller.onButtonWasPushed(1);
        System.out.println("--------按下电视机的关按钮-----------");
        controller.offButtonWasPushed(1);
        System.out.println("--------按下撤销按钮-----------");
        controller.undoButtonWasPushed();

        /**
         * 运行结果：
         *      --------按下灯的开按钮-----------
         *      电灯打开了...
         *      --------按下灯的关按钮-----------
         *      电灯关闭了...
         *      --------按下撤销按钮-----------
         *      电灯打开了...
         *      =========使用遥控器操作电视机==========
         *      --------按下电视机的开按钮-----------
         *      电视机打开了..
         *      --------按下电视机的关按钮-----------
         *      电视机关闭了..
         *      --------按下撤销按钮-----------
         *      电视机打开了..
         */


    }
}
