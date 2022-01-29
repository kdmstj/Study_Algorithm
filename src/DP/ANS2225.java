package DP;

import java.util.Scanner;

public class ANS2225 {

    static int N, K;
    static long dp[][];
    static int mod =  1000000000;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        //dp선언 및 초기화
        dp = new long[N+1][K+1];

        for(int j = 1 ; j <= K; j++){
            dp[1][j] = j;
        }

        for(int i = 1; i <= N; i++){
            dp[i][1] = 1;
        }


        for(int i = 2 ; i <= N; i++){
            for(int j = 2 ; j <= K; j++){

                dp[i][j] = (dp[i][j-1] + dp[i-1][j])%mod;

            }
        }

        System.out.println(dp[N][K]);


    }
}
