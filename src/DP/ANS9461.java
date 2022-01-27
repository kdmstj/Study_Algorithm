package DP;

import java.util.Scanner;

public class ANS9461 {

    static int N;
    static long[] dp;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        //dp선언 및 초기화
        for(int i = 0 ; i < N; i++){
            int num = sc.nextInt();

            dp = new long[num+4];

            dp[0] = dp[1] = dp[2] = 1;
            dp[3] = dp[4] = 2;

            for(int j = 5 ; j < num ; j++){
                dp[j] = dp[j-1] + dp[j-5];
            }
            System.out.println(dp[num-1]);
        }

    }
}
