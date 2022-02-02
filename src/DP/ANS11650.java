package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ANS11650 {

    static int N;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());


        dp = new Integer[N][2];
        for(int i = 0 ; i < N; i++){
             StringTokenizer st = new StringTokenizer(br.readLine()," ");
                dp[i][0] = Integer.parseInt(st.nextToken());
                dp[i][1] = Integer.parseInt(st.nextToken());

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
