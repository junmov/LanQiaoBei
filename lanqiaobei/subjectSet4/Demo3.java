package com.lanqiaobei.subjectSet4;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/14.
 * 算法提高 征税程序
 * 税务局希望你帮他们编写一个征税程序，该程序的功能是：
 * 首先输入某公司的年销售额sale和税率rate，然后程序将计算出相应的税额tax，并把它显示在屏幕上。
 * 计算公式是：tax = sale * rate。
 * 　　输入格式：输入只有一行，包括两个数据，即年销售额和税率。
 * 　　输出格式：输出只有一行，包括一个实数，即相应的税额，保留到小数点后两位。
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sale = sc.nextDouble();
        double rate = sc.nextDouble();
        System.out.printf("%.2f", sale * rate);
    }
}
