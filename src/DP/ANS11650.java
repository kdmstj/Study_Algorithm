package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ANS11650 {
    static int N;
    static int[][] dp;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());


        dp = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dp[i][0] = Integer.parseInt(st.nextToken());
            dp[i][1] = Integer.parseInt(st.nextToken());

        }



        //o[0] => x좌표, o[1] => y좌표
        //x좌표가 같으면 y좌표가 증가하는 순서대로 나열함.
        Arrays.sort(dp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                else{
                    return o1[1] - o2[1];
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(dp[i][0] + " " + dp[i][1]).append('\n');
        }
        System.out.println(sb);
    }


}