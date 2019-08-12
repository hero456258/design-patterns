package com.mingqian.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mingqian on 2019/8/12.
 */
public class InfoCollege implements College {

    List<Department> departments;

    public InfoCollege() {
        departments = new ArrayList<>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    /**
     * 添加系的方法
     *
     * @param name
     * @param desc
     */
    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    /**
     * 返回一个迭代器，遍历
     *
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
