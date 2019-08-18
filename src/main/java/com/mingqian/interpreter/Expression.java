package com.mingqian.interpreter;

import java.util.HashMap;

/**
 * Create by mingqian on 2019/8/18.
 * 抽象类表达式，通过HashMap键值对，可以获取到变量的值
 */
public abstract class Expression {

    /**
     * a+b-c
     * 解释公式和数值，key就是公式(表达时候)参数[a,b,c],value就是具体的值
     * HashMap = {a=10,b=20}
     * @param var
     * @return
     */
    public abstract int interpreter(HashMap<String,Integer> var);
}
