package DP;

import java.util.Scanner;

public class ANS11054 {

    static int N;
    static int[] A, dp;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        //수열 A, 배열 dp 선언 및 초기화
        A = new int[N];
        dp = new int[N];

        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
            dp[i] = 1;
        }





    }
}
