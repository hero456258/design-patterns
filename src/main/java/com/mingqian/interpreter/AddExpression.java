package com.mingqian.interpreter;

import java.util.HashMap;

/**
 * Create by mingqian on 2019/8/18.
 * 加法解释器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 处理相加
     * var仍然是{a=10,b=20}
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
