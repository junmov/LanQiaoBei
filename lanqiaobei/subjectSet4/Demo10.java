package com.lanqiaobei.subjectSet4;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/15.
 * 算法提高 判断回文
 * 编程判断一个字符串是否是回文，
 * 当字符串是回文时，输出字符串：yes!，
 * 否则输出字符串：no!。
 * 所谓回文即正向与反向的拼写都一样，如adgda。
 * 长度在100以内，且全为小写字母
 */
public class Demo10 {
    public static void main(String[] args) {
        String str1 = new Scanner(System.in).next();
        String str2 = new StringBuilder(str1).reverse().toString();
        if (str1.equals(str2)){
            System.out.println("yes!");
        }else {
            System.out.println("no!");
        }
    }
}
