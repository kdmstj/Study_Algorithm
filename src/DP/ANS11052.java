package DP;

import java.util.Scanner;

public class ANS11052 {

    static int N;
    static int[] dp, cost;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        //dp, cost 선언 및 초기화
        dp = new int[N+1];
        cost = new int[N+1];
        for(int i = 1 ; i <= N; i++){
            cost[i] = sc.nextInt();
        }

        dp[0] = 0;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], dp[i-j] + cost[j]);
            }
        }

        System.out.println(dp[N]);
    }
}
