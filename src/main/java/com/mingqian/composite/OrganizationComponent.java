package com.mingqian.composite;

/**
 * Created by mingqian on 2019/8/1.
 */
public abstract class OrganizationComponent {
    /**
     * 名字
     */
    private String name;

    /**
     *说明
     */
    private String desc;

    /**
     * 打印方法，做成抽象的，子类都需要实现
     */
    protected abstract void print();

    /**
     * 添加方法
     * @param organizationComponent
     */
    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    /**
     * 删除
     * @param organizationComponent
     */
    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
