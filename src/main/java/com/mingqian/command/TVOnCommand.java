package com.mingqian.command;

/**
 * Created by mingqian on 2019/8/8.
 * 电视开操作命令具体实现者
 */
public class TVOnCommand implements Command {

    /**聚合接收者*/
    private TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    /**
     * 执行动作(操作)
     */
    @Override
    public void execute() {
        tvReceiver.on();
    }

    /**
     * 撤销动作(操作)
     */
    @Override
    public void undo() {
        tvReceiver.off();
    }
}
