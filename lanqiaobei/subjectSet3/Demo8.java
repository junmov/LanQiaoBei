package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/14.
 * 算法训练 摆动序列
 */
public class Demo8 {
    public static void main(String[] args) {
        int k = new Scanner(System.in).nextInt();
        System.out.println(((int)Math.pow(2, k) - k - 1) * 2);
    }
}
