package com.lanqiaobei.subjectSet4;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/15.
 * 算法提高 班级排名
 */

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //学生人数
        for (int i = 0; i < N; i++) {
            String s = sc.next();
        }
        int M = sc.nextInt(); //考试次数
        int[][] scores = new int[M][N + 1];
        String name;
        int score;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                score = sc.nextInt();
                name = sc.next();
                if ("DaDa".equals(name)) {
                    scores[i][N] = score;
                }
                scores[i][j] = score;
            }
        }
        int paiming;
        for (int i = 0; i < M; i++) {
            score = scores[i][N];
            paiming = 1;
            for (int j = 0; j < N; j++) {
                if (score < scores[i][j]) {
                    paiming++;
                }
            }
            System.out.println(paiming);
        }
    }
}