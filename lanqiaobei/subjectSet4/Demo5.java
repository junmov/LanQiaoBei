package com.lanqiaobei.subjectSet4;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/14.
 * 算法提高 递归倒置字符数组
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str = sc.next();
        char[] chars = str.toCharArray();
        f(0, len - 1, chars);
        System.out.println();
        for (char c : chars) {
            System.out.print(c);
        }
    }

    private static void f(int start, int end, char[] chars) {
        if (end <= start) return;
        char c = chars[start];
        chars[start] = chars[end];
        chars[end] = c;
        for (char tmp : chars) {
            System.out.print(tmp);
        }
        System.out.println();
        f(start + 1, end - 1, chars);
    }
}
