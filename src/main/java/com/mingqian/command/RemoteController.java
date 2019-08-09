package com.mingqian.command;

/**
 * Created by mingqian on 2019/8/8.
 */
public class RemoteController {

    /**开按钮命令的数组*/
    Command[] onCommands;

    /**关按钮命令的数组*/
    Command[] offCommands;

    /**撤销按钮命令*/
    Command undoCommand;

    /**
     * 构造器，完成对按钮初始化
     */
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0;i<5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给我们的按钮设置你需要的命令
     * @param no
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开按钮
     * @param no
     */
    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     * @param no
     */
    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
