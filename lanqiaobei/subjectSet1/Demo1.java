package com.lanqiaobei.subjectSet1;

import java.util.Scanner;

/**
 * Created by junmov on 2017/8/2.
 * 入门训练 Fibonacci数列
 */
public class Demo1 {
    /*矩阵快速幂取模
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[][] arr = {{1, 1}, {1, 0}};
        int[][] ans = {{1, 0}, {0, 1}};
        while (b != 0) {
            if ((b & 1) != 0) {
                ans = fun(arr, ans);
            }
            arr = fun(arr, arr);
            b = b >> 1;
        }
        System.out.println(ans[0][1]);
    }

    private static int[][] fun(int[][] arr, int[][] arr2) {
        int[][] tmp = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    tmp[i][j] = (arr[i][k] * arr2[k][j] + tmp[i][j]) % 10007;
                }
            }
        }
        return tmp;
    }
    */
    // 递推法
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int[] a = new int[num + 2];
        a[1] = a[2] = 1;
        if (num == 1) {
            a[num] = 1;
        } else if (num == 2) {
            a[num] = 1;
        } else {
            for (int i = 3; i <= num; i++) {
                a[i] = (a[i - 1] + a[i - 2]) % 10007;
            }
        }
        System.out.println(a[num]);
    }
}
