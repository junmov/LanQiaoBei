package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/13.
 * 算法训练 数列
 */
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 31; i >= 0; i--) {
            if (((1 << i) & n) != 0) {
                sum += Math.pow(k, i);
            }
        }
        System.out.println(sum);
    }
}