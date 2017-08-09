package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/14.
 * 算法训练 瓷砖铺放
 * 有一长度为N(1<=Ｎ<=10)的地板，给定两种不同瓷砖：一种长度为1，另一种长度为2，数目不限。要将这个长度为N的地板铺满，一共有多少种不同的铺法？
 * 　　例如，长度为4的地面一共有如下5种铺法：
 * 　　4=1+1+1+1
 * 　　4=2+1+1
 * 　　4=1+2+1
 * 　　4=1+1+2
 * 　　4=2+2
 * 　　编程用递归的方法求解上述问题。
 * 输入格式
 * 　　只有一个数N，代表地板的长度
 * 输出格式
 * 　　输出一个数，代表所有不同的瓷砖铺放方法的总数
 */
public class Demo6 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
//        int sum = f(n);
//        System.out.println(sum);
        System.out.println(dp(n));
    }

    //动态规划
    private static int dp(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    //递归
    private static int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return f(n - 1) + f(n - 2);
    }
}
