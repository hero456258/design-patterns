package com.mingqian.command;

/**
 * Created by mingqian on 2019/8/8.
 * 开灯命令具体实现者
 */
public class LightOnCommand implements Command{

    /**聚合灯的接收者*/
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    /**
     * 执行动作(操作)
     */
    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.on();
    }

    /**
     * 撤销动作(操作)
     */
    @Override
    public void undo() {
        //调用接收者方法
        lightReceiver.off();
    }
}
