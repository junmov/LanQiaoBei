package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/11.
 * 算法训练 s01串
 */
public class Demo1 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        /*
        递归
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            String str = recursiveAchieved("0", "1", n);
            System.out.println(str);
        }
        */
        iterationAchieved(n);
    }

    //递归实现
    private static String recursiveAchieved(String s1, String s2, int n) {
        String s = s1 + s2;
        if (n == 2) return s;
        return recursiveAchieved(s2, s, n - 1);

    }

    //非递归实现
    private static void iterationAchieved(int n) {
        StringBuilder s01 = new StringBuilder("0");
        int i = 0, lenght;
        while (i < n) {
            lenght = s01.length();
            for (int j = 0; j < lenght; j++) {
                if (s01.charAt(j) == '0') {
                    s01.deleteCharAt(j).insert(j, "1");
                } else {
                    s01.deleteCharAt(j).insert(j, "01");
                    j++;
                    lenght++;
                }
            }
            i++;
        }
        System.out.println(s01.toString());
    }
}
