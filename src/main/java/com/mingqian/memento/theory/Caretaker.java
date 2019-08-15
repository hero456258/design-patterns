package com.mingqian.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingqian on 2019/8/15.
 * 守护者对象
 */
public class Caretaker {

    /**在list集合中会有很多的备忘绿对象*/
    private List<Memento> list = new ArrayList<>();

    public void add(Memento memento){
        list.add(memento);
    }

    /**
     * 获取第index个Originator的备忘录对象
     * (即保存的对象)
     * @param index
     * @return
     */
    public Memento get(int index){
        return list.get(index);
    }
}
