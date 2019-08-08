package com.mingqian.command;

/**
 * Created by mingqian on 2019/8/8.
 * 电视关命令具体实现者
 */
public class TVOffCommand implements Command{

    /**聚合接收者*/
    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    /**
     * 执行动作(操作)
     */
    @Override
    public void execute() {
        tvReceiver.off();
    }

    /**
     * 撤销动作(操作)
     */
    @Override
    public void undo() {
        tvReceiver.on();
    }
}
