package com.lanqiaobei.subjectSet4;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/14.
 * 算法提高 简单计算器
 */
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num;
        switch (c) {
            case "+":
                num = a + b;
                break;
            case "-":
                num = a - b;
                break;
            case "*":
                num = a * b;
                break;
            case "/":
                num = a / b;
                break;
            default:
                num = 0;
        }
        System.out.println(num);
    }
}
