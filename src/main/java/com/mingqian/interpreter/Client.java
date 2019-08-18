package com.mingqian.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Create by mingqian on 2019/8/18.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();//a+b
        HashMap<String, Integer> var = getValue(expStr);//var = [a=10,b=20]
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果" + expStr + "=" + calculator.run(var));
        /**
         * 运算结果
         *      请输入表达式:
         *      a+b-c
         *      请输入a的值:
         *      20
         *      请输入b的值:
         *      30
         *      请输入c的值:
         *      10
         *      运算结果a+b-c=40
         */
    }

    // 获得表达式
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式:");
        return (new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    // 获得值映射
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = expStr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        for (char c : expStr.toCharArray()) {
            if (c != '+' && c != '-') {
                if (!map.containsKey(String.valueOf(c))) {
                    System.out.println("请输入" + String.valueOf(c) + "的值:");
                    String context = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    map.put(String.valueOf(c), Integer.valueOf(context));
                }

            }
        }
        return map;
    }
}
