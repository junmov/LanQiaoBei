package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/31.
 * 算法训练 数的划分
 */
public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[n + 1][k + 1]; //a[i][j]表示将数i分成j份的方案数
        a[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i >= j) {
                    a[i][j] = a[i - j][j] + a[i - 1][j - 1]; //状态转移方程
                }
            }
        }
        System.out.println(a[n][k]);
    }
}

/*
input       output
200 5       583464
 */