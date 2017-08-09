package com.lanqiaobei.subjectSet4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by junmov on 2017/7/15.
 * 算法提高 数字黑洞
 */
public class Demo14 {
    public static void main(String[] args) {
        String n = new Scanner(System.in).next();
        int count = 0, num;
        char[] c = n.toCharArray();
        while (true) {
            Arrays.sort(c);
            num = 999 * (c[3] - c[0]) + 90 * (c[2] - c[1]); //化简所得
            count++;
            if (num == 6174) {
                break;
            }
            c = String.valueOf(num).toCharArray();
        }
        System.out.println(count);
    }
}
