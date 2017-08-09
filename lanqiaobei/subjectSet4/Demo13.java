package com.lanqiaobei.subjectSet4;

//import java.math.BigInteger;

import java.util.Scanner;

/**
 * Created by junmov on 2017/7/15.
 * 算法提高 快速幂
 */
public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* BigInteger方法
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger P = sc.nextBigInteger();
        BigInteger modPow = A.modPow(B, P);
        System.out.println(modPow);
        */

        //真正的快速幂算法
        long A = sc.nextLong();
        long B = sc.nextLong();
        int P = sc.nextInt();
        long ans = 1;
        while (B != 0) {
            if ((B & 1) == 1) {
                ans = (ans * A) % P;
            }
            B = B >> 1;
            A = ((A % P) * (A % P)) % P;
        }
        System.out.println(ans);
    }
}
