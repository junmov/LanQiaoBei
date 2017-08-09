package com.lanqiaobei.subjectSet4;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/14.
 * 算法提高 单词个数统计
 */
public class Demo6 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String[] strings = str.trim().split(" ");
        System.out.println(strings.length);
    }
}
