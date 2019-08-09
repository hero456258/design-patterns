package com.mingqian.composite;

/**
 * Created by mingqian on 2019/8/1.
 */
public class Department extends  OrganizationComponent {

    //add , remove 就不用写了，因为他是叶子节点

    public Department(String name, String desc) {
        super(name, desc);
    }

    /**
     * 打印方法，做成抽象的，子类都需要实现
     */
    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setDesc(String desc) {
        super.setDesc(desc);
    }
}
