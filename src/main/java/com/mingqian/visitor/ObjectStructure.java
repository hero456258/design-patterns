package com.mingqian.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mingqian on 2019/8/9.
 * 数据结构，管理很多人
 */
public class ObjectStructure {

    /**聚合Person*/
    private List<Person> persons = new LinkedList<>();

    /**
     * 添加
     * @param person
     */
    public void attach(Person person){
        persons.add(person);
    }

    /**
     * 删除
     * @param person
     */
    public void detach(Person person){
        persons.remove(person);
    }

    /**
     * 显示测评情况
     * @param action
     */
    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
