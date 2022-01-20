package DP;

import java.util.Scanner;

public class ANS9095 {
    static Integer[] dp;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        dp= new Integer[14];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;



        for(int i = 0 ; i < num ; i++){
            int element = sc.nextInt();
            System.out.println(recur(element));
        }





    }

    static int recur(int N){
        if(dp[N] == null){
            for(int i = 4 ; i < N+1  ; i++){
                dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            }
        }

        return dp[N];
    }
}
