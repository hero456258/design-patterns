package com.mingqian.command;

/**
 * Created by mingqian on 2019/8/8.
 * 没有任何命令，即空执行: 用于初始化每个按钮，当调用空命令时，
 * 对象什么都不做，其实，这样是一种设计模式，可以省掉对空判断
 */
public class NoCommand implements Command {
    /**
     * 执行动作(操作)
     */
    @Override
    public void execute() {

    }

    /**
     * 撤销动作(操作)
     */
    @Override
    public void undo() {

    }
}
