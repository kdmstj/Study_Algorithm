package DP;

import java.util.Scanner;

public class ANS11727 {
    static Integer[] dp;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        dp = new Integer[num+2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;

        System.out.print(recur(num));

    }

    static int recur(int N){

        for(int i = 3 ; i <= N ; i++){
            dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
        }
        return dp[N];
    }
}
