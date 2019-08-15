package com.mingqian.memento.theory;

/**
 * Created by mingqian on 2019/8/15.
 */
public class Originator {

    /**状态*/
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 保存状态对象
     * @return
     */
    public Memento saveStateMemento(){
        return new Memento(this.state);
    }

    /**
     * 通过备忘录对象恢复状态
     * @param memento
     */
    public void getStateFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
