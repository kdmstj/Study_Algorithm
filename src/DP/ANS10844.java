package DP;

import java.util.Scanner;

public class ANS10844 {


    final static long mod = 1000000000;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        //배열 선언
        long[][] dp = new long[num+1][10];


        //init 첫번째 자릿수는 오른쪽 맨 끝의 자릿수이므로 경우의 수가 1개 밖에 없음.
        for(int i = 0 ; i < 10 ; i++){
            dp[1][i] = 1;
        }

        //dp 채워넣기
        //길이가 2인 숫자부터 num인 숫자까지 확인하기
        for(int i = 2 ; i <= num ; i++){
            //끝자리 숫자를 0부터 9까지 확인하기
            for(int j = 0; j < 10 ; j++){

                if(j == 0){
                    dp[i][0] = dp[i-1][1] % mod;
                }
                else if(j == 9){
                    dp[i][9] = dp[i-1][8] % mod;
                }
                else{
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) %mod;
                }

            }
        }


        long result = 0;
        //결과 도출
        for(int i = 0 ; i <10  ; i++){
            result += dp[num][i];
        }

        System.out.println(result % mod);

    }


}
