package com.mingqian.iterator;

import java.util.Iterator;

/**
 * Created by mingqian on 2019/8/12.
 */
public interface College {

    public String getName();

    /**
     * 添加系的方法
     * @param name
     * @param desc
     */
    public void addDepartment(String name,String desc);

    /**
     * 返回一个迭代器，遍历
     * @return
     */
    public Iterator createIterator();
}
