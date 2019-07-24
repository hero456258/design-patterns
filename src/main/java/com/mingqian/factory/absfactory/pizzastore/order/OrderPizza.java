package com.mingqian.factory.absfactory.pizzastore.order;

import com.mingqian.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mingqian on 2019/7/24.
 */
public class OrderPizza {

    AbsFactory factory;

    public OrderPizza( AbsFactory factory){
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory) {
        this.factory = factory;
        Pizza pizza = null;
        //用户输入
        String orderType = "";
        do {
            orderType = getType();
            //factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败！");
                break;
            }

        }while (true);
    }

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     * @return
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请选择pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
