package com.mingqian.command;

/**
 * Created by mingqian on 2019/8/8.
 * 命令接口
 */
public interface Command {

    /**
     * 执行动作(操作)
     */
    public void execute();

    /**
     * 撤销动作(操作)
     */
    public void undo();
}
