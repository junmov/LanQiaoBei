package com.lanqiaobei.subjectSet4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by junmov on 2017/7/14.
 * 算法提高 摩尔斯电码
 */

public class Demo2 {
    private static char getOneChar(String A) {
        char result = 0;
        switch (A) {
            case "*-":
                result = 'a';
                break;
            case "-***":
                result = 'b';
                break;
            case "-*-*":
                result = 'c';
                break;
            case "-**":
                result = 'd';
                break;
            case "*":
                result = 'e';
                break;
            case "**-*":
                result = 'f';
                break;
            case "--*":
                result = 'g';
                break;
            case "****":
                result = 'h';
                break;
            case "**":
                result = 'i';
                break;
            case "*---":
                result = 'j';
                break;
            case "-*-":
                result = 'k';
                break;
            case "*-**":
                result = 'l';
                break;
            case "--":
                result = 'm';
                break;
            case "-*":
                result = 'n';
                break;
            case "---":
                result = 'o';
                break;
            case "*--*":
                result = 'p';
                break;
            case "--*-":
                result = 'q';
                break;
            case "*-*":
                result = 'r';
                break;
            case "***":
                result = 's';
                break;
            case "-":
                result = 't';
                break;
            case "**-":
                result = 'u';
                break;
            case "***-":
                result = 'v';
                break;
            case "*--":
                result = 'w';
                break;
            case "-**-":
                result = 'x';
                break;
            case "-*--":
                result = 'y';
                break;
            case "--**":
                result = 'z';
                break;
        }
        return result;
    }

    private static String getOneString(char[] A, int start, int end) {
        StringBuilder result = new StringBuilder("");
        for (int i = start; i <= end; i++)
            result.append(A[i]);
        return result.toString();
    }

    private static void printResult(String A) {
        int len = A.length();
        if (len < 1)
            return;
        char[] arrayA = A.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < len; i++) {
            int start = i;
            int end = i;
            for (; end < len; end++) {
                if (arrayA[end] == '|')
                    break;
            }
            String tempA = getOneString(arrayA, start, end - 1);
            list.add(getOneChar(tempA));
            i = end;
        }
        //输出最终结果
        for (Character aList : list) System.out.print(aList);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        printResult(A);
    }
}