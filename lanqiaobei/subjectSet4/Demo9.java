package com.lanqiaobei.subjectSet4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by junmov on 2017/7/15.
 * 算法提高 冒泡法排序
 */
public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
