package com.mingqian.memento.theory;

/**
 * Created by mingqian on 2019/8/15.
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态: create");
        //保存当前的状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态:pay");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态:success");
        caretaker.add(originator.saveStateMemento());
        System.out.println("当前的状态:" + originator.getState());

        System.out.println("开始恢复到状态1------->{}");
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("当前的状态:" + originator.getState());

        /**
         * 运行结果：
         *      当前的状态:状态:success
         *      开始恢复到状态1------->{}
         *      当前的状态:状态: create
         */
    }
}
