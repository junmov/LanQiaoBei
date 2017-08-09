package com.lanqiaobei.subjectSet4;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/15.
 * 算法提高 11-1实现strcmp函数
 */
public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(strcmp(s1, s2));
    }

    private static int strcmp(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len = Math.min(len1, len2);
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                return 1;
            }
            if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            }
        }
        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        } else {
            return 0;
        }
    }
}
