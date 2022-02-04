package DP;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ANS11004 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken()); // 1~N
        int K = Integer.parseInt(st1.nextToken()); // 1~K

        long[] dp = new long[N+1];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N; i++){
            dp[i] = Long.parseLong(st2.nextToken());
        }

        Arrays.sort(dp);

        System.out.println(dp[K]);


    }
}
