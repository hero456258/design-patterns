package com.mingqian.iterator;

import java.util.Iterator;

/**
 * Created by mingqian on 2019/8/12.
 */
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要Department 是以怎样的方式存放 -> 数组
    Department[] departments;
    int position = 0;//遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }
}
