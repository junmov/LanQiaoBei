package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/13.
 *  * 分析:
 * 3^0
 * 3^1 3^0+3^1
 * 3^2 3^0+3^2 3^1+3^2  3^0+3^1+3^2
 * 规律当前n加进去一个，然后要再加上前面所有的个数
 * 如果到了某个n,加前面所有的大于N个,就扫下剩下的第几个就行
 * 时间复杂度O(n)
 * f(n)=1+2*f(n-1)   fn表示有几个数目前
 * f(0)=1;
 * f(1)=3;
 * f(2)=7;
 * 求得大于等于N时的n，然后N-f(n-1)剩下的从左边开始数
 */
public class Demo4_true {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int len = 0;
        int now = 1;
        long[] a = new long[n];
        while (len < n) {
            int tmp = len;
            a[len++] = now;
            for (int i = 0; i < tmp && len < n; i++) {
                a[len++] = now + a[i];
            }
            now *= k;
        }
        System.out.println(a[n - 1]);
    }
}
//13 600
//2019422348

//13^8 = 815730721
