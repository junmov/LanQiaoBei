package com.lanqiaobei.test;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[][] arr = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // 矩阵快速幂
        int[][] ans = {{1, 0}, {0, 1}};
        while (b != 0) {
            if ((b & 1) != 0) {
                ans = a(arr, ans);
            }
            arr = a(arr, arr);
            b = b >> 1;
        }
        // 打印结果
        System.out.println(ans[0][0] + " " + ans[0][1] + "\n" + ans[1][0] + " " + ans[1][1]);
    }

    //二阶矩阵乘法
    private static int[][] a(int[][] arr, int[][] arr2) {
        int[][] tmp = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int buf = 0;
                for (int k = 0; k < 2; k++) {
                    buf = arr[i][k] * arr2[k][j] + buf;
                }
                tmp[i][j] = buf;
            }
        }
        return tmp;
    }
}
/*
int maxValue:
2147483647

long maxValue
9223372036854775807

 */