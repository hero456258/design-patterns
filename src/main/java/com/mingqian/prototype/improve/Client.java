package com.mingqian.prototype.improve;

/**
 * Created by mingqian on 2019/7/24.
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("jack",3,"black","China");
        sheep.friend = new Sheep("lucy",4,"while","Canada");

        Sheep sheep2 = (Sheep)sheep.clone();//克隆
        Sheep sheep3 = (Sheep)sheep.clone();//克隆
        Sheep sheep4 = (Sheep)sheep.clone();//克隆
        Sheep sheep5 = (Sheep)sheep.clone();//克隆
        System.out.println("sheep2 = " + sheep2 + "sheep2.friend = " + sheep2.friend.hashCode());
        System.out.println("sheep3 = " + sheep2 + "sheep3.friend = " + sheep3.friend.hashCode());
        System.out.println("sheep4 = " + sheep2 + "sheep4.friend = " + sheep4.friend.hashCode());
        System.out.println("sheep5 = " + sheep2 + "sheep5.friend = " + sheep5.friend.hashCode());
    }
}
