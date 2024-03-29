package com.mingqian.prototype.deepclone;

import java.io.Serializable;

/**
 * Created by mingqian on 2019/7/25.
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /**
     * 因为该类的属性，都是String，因此我们这里使用默认的clone完成即可
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
