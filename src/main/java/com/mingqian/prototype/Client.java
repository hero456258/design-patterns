package com.mingqian.prototype;

/**
 * Created by mingqian on 2019/7/24.
 */
public class Client {

    public static void main(String[] args) {

        //传统方案
        Sheep sheep = new Sheep("tom",3,"白色");
        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());

        System.out.println("sheep = " + sheep);
        System.out.println("sheep1 = " + sheep1);
        System.out.println("sheep2 = " + sheep2);
        System.out.println("sheep3 = " + sheep3);
        System.out.println("sheep4 = " + sheep4);

        /**
         * 运行结果：
         *      sheep = Sheep{name='tom', age=3, color='白色'}
         *      sheep1 = Sheep{name='tom', age=3, color='白色'}
         *      sheep2 = Sheep{name='tom', age=3, color='白色'}
         *      sheep3 = Sheep{name='tom', age=3, color='白色'}
         *      sheep4 = Sheep{name='tom', age=3, color='白色'}
         */
    }
}
