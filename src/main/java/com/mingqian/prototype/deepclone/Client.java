package com.mingqian.prototype.deepclone;

/**
 * Created by mingqian on 2019/7/25.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deep = new DeepProtoType();
        deep.name = "宋江";
        deep.deepCloneableTarget = new DeepCloneableTarget("大牛","小牛");

        //方式一完成深拷贝
        DeepProtoType deep2 = (DeepProtoType) deep.clone();
        System.out.println("deep.name=" + deep.name + "deep.deepCloneableTarget=" + deep.deepCloneableTarget.hashCode());
		System.out.println("deep2.name=" + deep2.name + "deep2.deepCloneableTarget=" + deep2.deepCloneableTarget.hashCode());
        /**
         * 运行结果：
         *      deep.name=宋江deep.deepCloneableTarget=1163157884
         *      deep2.name=宋江deep2.deepCloneableTarget=1956725890
         */

        //方式二完成深拷贝
        DeepProtoType deep3 = (DeepProtoType)deep.deepClone();
        System.out.println("deep.name=" + deep.name + "deep.deepCloneableTarget=" + deep.deepCloneableTarget.hashCode());
        System.out.println("deep3.name=" + deep2.name + "deep3.deepCloneableTarget=" + deep3.deepCloneableTarget.hashCode());
        /**
         * 运行结果：
         *      deep.name=宋江deep.deepCloneableTarget=1163157884
         *      deep3.name=宋江deep3.deepCloneableTarget=381259350
         */

    }
}
