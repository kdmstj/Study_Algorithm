package DP;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class ANS10989 {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] dp = new Integer[N];

        for(int i = 0 ; i < N ; i++){
            dp[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < N; i++){
            while(dp[i] > 0){
                sb.append(i).append('\n');
                dp[i]--;
            }
        }
        System.out.println(sb);

    }

}
