package com.mingqian.interpreter;

import java.util.HashMap;

/**
 * Create by mingqian on 2019/8/18.
 * 变量的解释器
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
