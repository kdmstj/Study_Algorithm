package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ANS1699 {

    static int N;
    static int[] dp;

    public static void main(String[] args) throws IOException {


        //선언
        BufferedReader  bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());

        //dp선언 및 초기화
        dp = new int[N+1];
        dp[0] = 0;

        for(int i = 1 ; i <= N; i++){
            dp[i] = i;
            for(int j = 1; j*j <= i ; j++){
                if(dp[i- j*j]+1 < dp[i]){
                    dp[i] = dp[i-j*j] +1;
                }
            }
        }
        System.out.println(dp[N]);
    }
}
