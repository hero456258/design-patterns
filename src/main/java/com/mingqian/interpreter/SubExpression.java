package com.mingqian.interpreter;

import java.util.HashMap;

/**
 * Create by mingqian on 2019/8/18.
 * 减法解释器
 */
public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 处理相减
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}

