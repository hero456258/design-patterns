package com.mingqian.iterator;

import java.util.Iterator;

/**
 * Created by mingqian on 2019/8/12.
 */
public class ComputerCollege implements College {

    Department[] departments;
    //保存当前数组的对象个数
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java专业", " Java专业 ");
        addDepartment("PHP专业", " PHP专业 ");
        addDepartment("大数据专业", " 大数据专业 ");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    /**
     * 添加系的方法
     *
     * @param name
     * @param desc
     */
    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    /**
     * 返回一个迭代器，遍历
     *
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
