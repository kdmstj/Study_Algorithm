package DP;

import java.util.Scanner;

public class ANS11057 {

    final static int mod = 10007;
    static int num;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //수의 길이 입력
        num = sc.nextInt();

        //long형 배열 선언 및 초기화 dp[자리수][마지막 숫자]
        int[][] dp = new int[num+1][10];
        for(int i = 0; i < 10 ; i++){
            dp[1][i] = 1;
        }

        for(int i = 2; i <= num; i++){
            for(int j = 0 ; j < 10 ; j++){
                for(int k = 0; k <= j ; k++){
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= mod;
                }
            }
        }

        int result = 0;
        for(int i = 0 ; i < 10 ; i++){
            result += dp[num][i];
        }
        System.out.println(result%mod);


    }
}

