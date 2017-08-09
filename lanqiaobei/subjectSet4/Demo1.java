package com.lanqiaobei.subjectSet4;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/14.
 * 算法提高 9-1九宫格
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        int row1 = arr[0] + arr[1] + arr[2];
        int row2 = arr[3] + arr[4] + arr[5];
        int row3 = arr[6] + arr[7] + arr[8];
        int col1 = arr[0] + arr[3] + arr[6];
        int col2 = arr[1] + arr[4] + arr[7];
        int col3 = arr[2] + arr[5] + arr[8];
        int dj1 = arr[0] + arr[4] + arr[8];
        int dj2 = arr[2] + arr[4] + arr[6];
        int[] arr2 = {row1, row2, row3, col1, col2, col3, dj1, dj2};
        int flag = 1;
        for (int i = 0; i < 7; i++) {
            if (arr2[i] != arr2[i + 1]) {
                flag = 0;
                break;
            }
        }
        System.out.println(flag);
    }
}
