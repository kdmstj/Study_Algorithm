package DP;

import java.util.Scanner;

public class ANS2133 {

    static int N;
    static int[] dp;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        //dp선언 및 초기화
        dp = new int[N+1];
        for(int i = 1 ; i < N ; i++){
            dp[i] = 0;
        }

        dp[0] = 1;
        for(int i = 2 ; i <= N ; i++){
            dp[i] = dp[i-2] * 3;
            for(int j = i-4; j >= 0 ;j-=2){
                dp[i] += dp[j] *2;
            }
        }

        System.out.println(dp[N]);
    }
}
