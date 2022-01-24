package DP;

import java.util.Scanner;

public class ANS2156 {

    static int[] cost, dp;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //포도잔의 개수 입력(1-n)
        int n = sc.nextInt();
        cost = new int[n+1];
        dp = new int[n+1];



        for(int i = 1 ; i <= n ; i++){
            cost[i] = sc.nextInt();
        }

        dp[1] = cost[1];
        if(n > 1){
            dp[2] = cost[1] + cost[2];
        }

        for(int k = 3 ; k <=n ; k++){
            dp[k] = Math.max(dp[k-1], Math.max(dp[k-2] + cost[k], dp[k-3] + cost[k-1] + cost[k]));
        }

        System.out.println(dp[n]);

    }
}
