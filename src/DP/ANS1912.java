package DP;

import java.util.Scanner;

public class ANS1912 {

    static int N;
    static int[] dp, A;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //N입력
        N = sc.nextInt();

        //수열 A, 배열 dp 선언 및 초기화
        A = new int[N];
        dp = new int[N];
        for(int i = 0 ; i < N ;i++){
            A[i] = sc.nextInt();
            dp[i] = 0;
        }
        dp[0] = A[0];
        int max = A[0];

        for(int i = 1 ; i < N ; i++){
            dp[i] = Math.max(dp[i-1] + A[i], A[i]);
            max = Math.max(max,dp[i]);

        }

        System.out.println(max);


    }
}
