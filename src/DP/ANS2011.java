package DP;

import java.util.Scanner;



public class ANS2011 {

    static String N;
    static long dp[];
    static int mod = 1000000;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        N = sc.nextLine();
        int num = Integer.parseInt(N);

        dp = new long[num+1];

        for(int i = 1 ; i < 10; i++){
            dp[i] = 1;
        }
        for(int i = 11; i < 27; i++){
            dp[i] = 2;
            if(i == 20){
                dp[20] = 1;
            }
        }

        for(int i = 27 ; i <= num ; i++) {
            String str = null;
            if (Integer.parseInt(String.valueOf(i).substring(0, 2)) > 26) {
                str = String.valueOf(i);
                dp[i] = (1 + dp[Integer.parseInt(str.substring(2))]) % mod;
            } else {
                dp[i] = (2 + dp[Integer.parseInt(str.substring(1))] + dp[Integer.parseInt(str.substring(2))]) % mod;
            }
        }

        System.out.println(dp[num]);

    }
}
