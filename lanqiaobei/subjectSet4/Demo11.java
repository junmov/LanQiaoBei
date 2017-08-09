package com.lanqiaobei.subjectSet4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by junmov on 2017/7/15.
 * 算法提高 队列操作
 */
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        int[][] arr = new int[2][N];
        for (int i = 0; i < N; i++) {
            arr[0][i] = sc.nextInt();
            if (arr[0][i] == 1) {
                arr[1][i] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            if (arr[0][i] == 1) {
                queue.add(arr[1][i]);
            } else if (arr[0][i] == 2) {
                if (queue.isEmpty()) {
                    System.out.println("no");
                    return;
                }
                System.out.println(queue.remove());
            } else {
                System.out.println(queue.size());
            }
        }
    }
}
