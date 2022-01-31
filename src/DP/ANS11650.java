package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ANS11650 {

    static int N;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(br.readLine());


        dp = new Integer[N][2];
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < 2; j++){
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(dp);

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < N; j++){
                sb.append(dp[i][j] +"\n");
            }
        }


    }
}
