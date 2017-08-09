package com.lanqiaobei.subjectSet4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by junmov on 2017/7/14.
 * 算法提高 统计单词数
 */
public class Demo7 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String s = str.trim().replaceAll("[\\pP,.]", "").toUpperCase();
        String[] split = s.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        String s1;
        for (String aSplit : split) {
            s1 = aSplit;
            int count = 0;
            if (map.containsKey(s1)) {
                count = map.get(s1);
            }
            map.put(s1, ++count);
        }
        for (String key : map.keySet()) {
            System.out.print(key + ":");
            int num = map.get(key);
            for (int i = 0; i < num; i++) {
                System.out.print('*');
            }
            System.out.print(num);
            System.out.println();
        }
    }
}
