package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/13.
 * 算法训练 阿尔法乘积
 */
public class Demo3 {
    public static void main(String[] args) {
//        int n = new Scanner(System.in).nextInt();
//        System.out.println(a(n));
        String s = new Scanner(System.in).next();
        System.out.println(f(s));
    }

    private static int a(int n) {
        while (n / 10 != 0) {
            n = sum(n);
        }
        return n;
    }

    private static int sum(int n) {
        int k = 1, t;
        while (n != 0) {
            t = n % 10;
            if (t != 0) {
                k = k * t;
            }
            n = n / 10;
        }
        return k;
    }

    //递归解法
    private static String f(String str) {
        if (str.length() == 1) {
            return str;
        }
        char[] chars = str.toCharArray();
        int sum = 1;
        for (char c : chars) {
            if (c != '0') {
                sum *= (c - '0');
            }
        }
        String s = String.valueOf(sum);
        return f(s);
    }
}
