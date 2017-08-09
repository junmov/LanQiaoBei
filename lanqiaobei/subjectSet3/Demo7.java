package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/14.
 * 算法训练 2的次幂表示
 */
public class Demo7 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        f(n);
    }

    private static void f(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }
        int cnt = 0;
        for (int i = 15; i >= 0; i--) {
            if (((1 << i) & n) != 0) {
                if (cnt > 0) System.out.print("+");
                cnt++;
                if (i == 1) System.out.print("2");
                else {
                    System.out.print("2(");
                    f(i);
                    System.out.print(")");
                }
            }
        }
    }
}