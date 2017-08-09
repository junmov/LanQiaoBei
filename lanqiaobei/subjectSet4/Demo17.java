package com.lanqiaobei.subjectSet4;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/27.
 * 算法提高 递推求值
 * <p>
 * F(n, 1) = F(n-1, 2) + 2F(n-3, 1) + 5
 * F(n, 2) = 2F(n-3, 2) + F(n-1, 1) + 3F(n-3, 1)  + 3.
 * F(1, 1) = 2, F(2, 1) = 1, F(3, 1) = 6,F(1, 2) = 3, F(2, 2) = 4,  F(3, 2) = 5。
 * <p>
 * 参考资料 ：
 * http://www.cnblogs.com/frog112111/archive/2013/05/19/3087648.html
 * http://www.cnblogs.com/frog112111/archive/2013/05/16/3082416.html
 */
public class Demo17 {
    /* 暴力递推
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        int f11 = 2, f21 = 1, f31 = 6, f12 = 3, f22 = 4, f32 = 5;
        int f1 = 0, f2 = 0;
        for (long i = 3; i < n; i++) {
            f1 = (f32 + 2 * f11 + 5) % 99999999;
            f2 = (2 * f12 + f31 + 3 * f11 + 3) % 99999999;
            f11 = f21;
            f21 = f31;
                   f12 = f22;
            f22 = f32;
            f32 = f2;
        }
        System.out.println(f1 + "\n" + f2);
    }
    */

    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        if (n == 1) {
            System.out.println(2 + "\n" + 3);
            return;
        }
        if (n == 2) {
            System.out.println(1 + "\n" + 4);
            return;
        }
        n = n - 3;
        // 构造矩阵
        long[][] base = {{6, 5, 1, 4, 2, 3, 5, 3}};
        long[][] arr = {{0, 1, 1, 0, 0, 0, 0, 0},
                {1, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {2, 3, 0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 1}};
        // 矩阵快速幂
        long[][] ans = new long[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == j) {
                    ans[i][j] = 1;
                }
            }
        }
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = f(arr, ans);
            }
            arr = f(arr, arr);
            n = n >> 1;
        }
        long[][] res = f(base, ans);
        System.out.println(res[0][0] + "\n" + res[0][1]);
    }

    private static long[][] f(long[][] arr1, long[][] arr2) {
        int row = arr1.length;
        long[][] tmp = new long[row][8];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    tmp[i][j] = (tmp[i][j] + arr1[i][k] * arr2[k][j]) % 99999999;
                }
            }
        }
        return tmp;
    }
}
/*
input
94312982319481923

output
1562661
26622527
*/