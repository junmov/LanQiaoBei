package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/12.
 * 算法训练 字符串变换
 */
public class Demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        String str = sc.next();
        if (order == 1) {
            System.out.println(str.toUpperCase());
        } else if (order == 2) {
            System.out.println(str.toLowerCase());
        } else if (order == 3) {
            System.out.println(new StringBuilder(str).reverse().toString());
        } else if (order == 4) {
            char c;
            for (int i = 0, j = str.length(); i < j; i++) {
                c = str.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    System.out.print((char) (c + 32));
                } else {
                    System.out.print((char) (c - 32));
                }
            }
        } else {
            String s = 0 + str.toLowerCase();
            StringBuilder sb = new StringBuilder();
            int i = 1;
            while (i < s.length()) {
                if (s.charAt(i) != s.charAt(i - 1) + 1) {
                    sb.append(s.charAt(i));
                    i++;
                    continue;
                }
                int k = 0;
                while (i < s.length()) {
                    if (s.charAt(i) != s.charAt(i - 1) + 1) {
                        break;
                    }
                    k++;
                    i++;
                }
                if (k > 1) {
                    sb.append('-');
                }
                sb.append(s.charAt(i - 1));
            }
            System.out.println(sb.toString());
        }
    }
}

