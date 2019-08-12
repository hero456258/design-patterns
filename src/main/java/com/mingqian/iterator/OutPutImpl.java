package com.mingqian.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by mingqian on 2019/8/12.
 */
public class OutPutImpl {

    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("-------" + college.getName() + "-------");
            printDepartment(college.createIterator()); //得到对应迭代器
        }
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department  = (Department)iterator.next();
            System.out.println(department.getName());
        }

    }
}
