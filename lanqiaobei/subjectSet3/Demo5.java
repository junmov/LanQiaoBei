package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

 /**
 * Created by junmov on 2017/7/13.
 * 算法训练 幂方分解
 * 任何一个正整数都可以用2的幂次方表示。例如：
 * 137=2^7+2^3+2^0
 * 同时约定方次用括号来表示，即ab 可表示为a（b）。
 * 由此可知，137可表示为：
 * 2（7）+2（3）+2（0）
 * 进一步：7= 22+2+20 （21用2表示）
 * 3=2+20
 * 所以最后137可表示为：
 * 2（2（2）+2+2（0））+2（2+2（0））+2（0）
 * 又如：
 * 1315=210 +28 +25 +2+1
 * 所以1315最后可表示为：
 * 2（2（2+2（0））+2）+2（2（2+2（0）））+2（2（2）+2（0））+2+2（0）
 * 输入格式 输入包含一个正整数N（N<=20000），为要求分解的整数。
 * 输出格式　程序输出包含一行字符串，为符合约定的n的0，2表示（在表示中不能有空格）
 */
public class Demo5 {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        f(n);
    }

    /*
     如果 n = 0 打印 0 ，return
     如果 i = 1 打印 2
     如果 i ！=1 递归调用
    */
    private static void f(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }
        int cnt = 0;
        for (int i = 15; i >= 0; i--) {
//            位运算 4&7
//            7  = [ 111 ]
//            4  = [ 100 ]
//          4 & 7= [ 100 ] = 4
            if (((1 << i) & n) != 0) {

                if (cnt != 0) {
                    System.out.print("+");
                }
                cnt++;
                if (i == 1) {
                    System.out.print("2");
                } else {
                    System.out.print("2(");
                    f(i);
                    System.out.print(")");
                }

            }
        }
    }
}
