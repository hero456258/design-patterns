package com.mingqian.prototype.improve;

/**
 * Created by mingqian on 2019/7/24.
 * 羊
 */
public class Sheep implements Cloneable{

    /**姓名*/
    private String name;

    /**年龄*/
    private int age;

    /**颜色*/
    private String color;

    /**地址*/
    private String address;

    /**是对象，克隆是如何处理 -> 默认是浅拷贝*/
    public Sheep friend;

    public Sheep() {

    }

    public Sheep(String name, int age, String color, String address) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    protected Object clone()  {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
