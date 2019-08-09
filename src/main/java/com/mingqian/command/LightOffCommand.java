package com.mingqian.command;

/**
 * Created by mingqian on 2019/8/8.
 * 关灯命令具体实现者
 */
public class LightOffCommand implements Command{

    /**聚合灯接收者*/
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    /**
     * 执行动作(操作)
     */
    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.off();
    }

    /**
     * 撤销动作(操作)
     */
    @Override
    public void undo() {
        //调用接收者的方法
        lightReceiver.on();
    }
}
