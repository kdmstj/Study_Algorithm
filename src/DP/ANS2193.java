package DP;

import java.util.Scanner;

public class ANS2193 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //자릿수 입력
        int num = sc.nextInt();

        //dp선언 및 초기화
        long dp[][] = new long[num+1][2];
        dp[1][1] = 1;
        dp[1][0] = 0;

        //dp구하기
        for(int i = 2 ; i <= num ; i++){
            for(int j = 0 ; j <=1 ; j++){
                if(j == 0){
                    dp[i][j] = dp[i-1][0] + dp[i-1][1];
                }
                else{
                    //j == 1일 경우,
                    dp[i][j] = dp[i-1][0];
                }
            }
        }

        //결과구하기
        long result = 0;
        for(int i = 0 ; i <= 1; i++){
            result += dp[num][i];
        }
        System.out.println(result);
    }
}
