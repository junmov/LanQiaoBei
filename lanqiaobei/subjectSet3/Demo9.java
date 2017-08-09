package com.lanqiaobei.subjectSet3;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/27.
 * 算法训练 乘积最大
 */
public class Demo9 {
    private static int n, m;
    private static int num[] = new int[55];
    private static int dp[][] = new int[55][55];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        String str = sc.next();
        for (int i = 1; i <= n; i++) {
            num[i] = Integer.parseInt(str.charAt(i - 1) + "");
        }
        solve();
    }

    private static int getVal(int s, int e) {
        int ans = 0;
        for (int i = s; i <= e; i++) {
            ans = ans * 10 + num[i];
        }
        return ans;
    }

    private static void solve() {
        for (int i = 1; i <= n; i++)
            dp[i][0] = getVal(1, i);
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= m & j < i; j++) {
                for (int k = 1; k < i; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[k][j - 1] * getVal(k + 1, i));
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}