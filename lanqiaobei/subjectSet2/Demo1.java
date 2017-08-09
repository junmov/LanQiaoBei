package com.lanqiaobei.subjectSet2;

import java.util.Scanner;

/**
 * Created by junmov on 2017/8/4.
 * 基础练习 矩阵乘法
 */
public class Demo1 {
    //矩阵快速幂算法
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        int[][] nums = new int[N][N];
        int[][] res = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                nums[i][j] = sc.nextInt();
                if (i == j) {
                    res[i][j] = 1;
                }
            }
        }
        while (M != 0) {
            if ((M & 1) != 0) {
                res = f(res, nums);
            }
            M = M >> 1;
            nums = f(nums, nums);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] f(int[][] arr1, int[][] arr2) {
        int[][] tmp = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    tmp[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return tmp;
    }
    /* 暴力算法
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        if (M == 1) {
            printNum(matrix, N);
        } else if (M == 0) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = 1;
                }
            }
            printNum(matrix, N);
        } else if (M >= 2 && M <= 5) {
            getNum(matrix, N, M);
        }
    }

    private static void getNum(int[][] matrix, int N, int M) {
        int[][] matrixCopy = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    matrixCopy[i][j] += matrix[i][k] * matrix[k][j];//交换
                }
            }
        }
        --M;
        while ((--M) > 0) {
            int[][] temp = new int[N][N];
            for (int i = 0; i < N; i++) {
                System.arraycopy(matrixCopy[i], 0, temp[i], 0, N);
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrixCopy[i][j] = 0;//用于清空上次结果，用temp保存上次结果参加运算
                    for (int k = 0; k < N; k++) {
                        matrixCopy[i][j] += temp[i][k] * matrix[k][j];
                    }
                }
            }
        }
        printNum(matrixCopy, N);
    }

    private static void printNum(int[][] matrix, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    */
}
