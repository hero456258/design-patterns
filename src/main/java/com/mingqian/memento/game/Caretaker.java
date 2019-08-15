package com.mingqian.memento.game;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mingqian on 2019/8/15.
 * 守护者对象
 */
public class Caretaker {

    private List<Memento> list =  new LinkedList<>();
    //对多个游戏角色保存多个状态
    //private HashMap<String, ArrayList<Memento>> rolesMementos;

    public void add(Memento memento){
        list.add(memento);
    }

    public Memento get(int index){
        return list.get(index);
    }
}
