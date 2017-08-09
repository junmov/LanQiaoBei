package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/31.
 * 算法训练 矩阵乘方
 */
public class Demo11 {

    //    private static int[][] tmp = new int[2][2];
    private static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        if (b == 0) {
            System.out.println("0 0\n0 0");
            return;
        }
//        矩阵快速幂
        int[][] ans = {{1, 0}, {0, 1}};
        while (b != 0) {
            if ((b & 1) != 0) {
                ans = f(arr, ans);
            }
            arr = f(arr, arr);
            b = b >> 1;
        }

        //打印结果
        System.out.println(ans[0][0] + " " + ans[0][1] + "\n" + ans[1][0] + " " + ans[1][1]);
    }

    //二阶矩阵乘法
    private static int[][] f(int[][] arr, int[][] arr2) {
        int[][] tmp = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int buf = 0;
                for (int k = 0; k < 2; k++) {
                    buf = (((arr[i][k] % m) * (arr2[k][j]) % m) % m + buf % m) % m;
                }
                tmp[i][j] = buf;
            }
        }
        return tmp;
    }
}
/*
input:
926625412 1203
14771 11538
1869 19912

output:
538 1005
180 421
 */