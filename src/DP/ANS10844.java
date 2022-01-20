package DP;

import java.util.Scanner;

public class ANS10844 {
    static Integer[] dp;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        dp = new Integer[num+1];
        dp[0]  =0;
        dp[1] = 9;

        System.out.println(recur(num));

    }

    static int recur(int N){

        if(dp[N] == null){
            for(int i = 2 ; i < N+1 ; i++){
                dp[i] = ((2 * dp[i-1] -2) / 1000000000);
            }
        }
        return dp[N];
    }
}
