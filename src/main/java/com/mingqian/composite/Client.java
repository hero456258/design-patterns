package com.mingqian.composite;

/**
 * Created by mingqian on 2019/8/1.
 */
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponent component = new University("清华大学","清华园");

        //创建学院
        OrganizationComponent collegeSchool = new College("计算机学院","计算机学院");
        OrganizationComponent collegeSchool2 = new College("信息工程学院","信息工程学院");

        //创建各个学院下面的系(专业)
        collegeSchool.add(new Department("软件工程","软件工程不错"));
        collegeSchool.add(new Department("网络工程","网络工程"));
        collegeSchool.add(new Department("计算机科学与技术", " 计算机科学与技术是老牌的专业 "));

        collegeSchool2.add(new Department("通信工程","通信工程不好学"));
        collegeSchool2.add(new Department("信息工程","信息工程好学"));

        //将学院添加到学校
        component.add(collegeSchool);
        component.add(collegeSchool2);

        component.print();

        /**
         * 运行结果：
         *      -----------清华大学-------------
         *      -----------计算机学院--------------
         *      软件工程
         *      网络工程
         *      计算机科学与技术
         *      -----------信息工程学院--------------
         *      通信工程
         *      信息工程
         */
    }
}
