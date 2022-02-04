package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ANS10814 {

    static String[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //온라인 저지 회원의 수

        dp = new String[N][2];
        for(int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            dp[i][0] = st.nextToken(); //나이
            dp[i][1] = st.nextToken(); //이름
        }

        Arrays.sort(dp, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i = 0 ; i < N ;i++){
            System.out.println(dp[i][0]+' '+dp[i][1]);
        }
    }
}
