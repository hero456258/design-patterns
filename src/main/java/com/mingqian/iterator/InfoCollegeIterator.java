package com.mingqian.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by mingqian on 2019/8/12.
 */
public class InfoCollegeIterator implements Iterator {
    List<Department> departments;// 信息工程学院是以List方式存放系
    int index = -1;//索引

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1){
            return false;
        }
        index += 1;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
}
