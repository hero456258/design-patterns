package com.mingqian.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * Create by mingqian on 2019/8/18.
 * 计算
 */
public class Calculator {

    /**聚合表达式*/
    private Expression expression;

    public Calculator(String expStr){

        //安排运算先后运算
        Stack<Expression> stack = new Stack<>();
        char[] chars = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {

                case '+':
                    left = stack.pop();//从stack取出left ->'a'
                    right = new VarExpression(String.valueOf(chars[++i]));//取出右表示式
                    stack.push(new AddExpression(left,right));//然后根据得到left和right构建AddExpression加入stack
                    break;

                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left,right));
                    break;

                default:
                    //如果是一个var就创建要给VarExpression对象，并push到stack
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        //当遍历完整个chars数组后，stack就得到最后的Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var){
        //最后将表达式a+b和var={a=10,b=20}
        //然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
