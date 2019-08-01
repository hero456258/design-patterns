package com.mingqian.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingqian on 2019/8/1.
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> components = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    /**
     * 添加方法
     *
     * @param organizationComponent
     */
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        components.add(organizationComponent);
    }

    /**
     * 删除
     *
     * @param organizationComponent
     */
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        components.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    /**
     * 打印方法，做成抽象的，子类都需要实现
     */
    @Override
    protected void print() {
        System.out.println("-----------" + getName() + "-------------");
        for (OrganizationComponent component : components) {
            component.print();
        }
    }
}
