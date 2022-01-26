package DP;

import java.util.Scanner;

public class ANS2579 {

    static int N;
    static long[] dp, arr;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        //배열 선언 및 초기화
        arr = new long[N+2];
        dp= new long[N+2];
        arr[0] = 0;
        for(int i = 1 ; i <= N; i++){
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];

        for(int i = 3 ; i < N+1; i++){
            dp[i] = Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]);
        }


        System.out.println(dp[N]);
    }
}
