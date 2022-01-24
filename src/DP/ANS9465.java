package DP;

import java.util.Scanner;

public class ANS9465 {

    static int dp[][], cost[][];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //테스트 케이스
        int t = sc.nextInt();

        for(int i = 0 ; i < t ; i++){
            //테스트 케이스 별 n을 입력받는다.
            int n = sc.nextInt();

            //입력된 n에 따라 배열을 선언
            dp = new int[2][n+1];
            cost = new int[2][n+1];

            //2*n의 비용을 입력받는다.
            for(int j = 0 ; j < 2 ; j++){
                for(int k = 1 ; k <= n ; k++){
                    cost[j][k] = sc.nextInt();
                }
            }

            //dp초기화
            dp[0][1] = cost[0][1];
            dp[1][1] = cost[1][1];

            for(int m = 2 ; m <= n ; m++){
                dp[0][m] = Math.max(dp[1][m-1], dp[1][m-2]) + cost[0][m];
                dp[1][m] = Math.max(dp[0][m-1], dp[0][m-2]) + cost[1][m];
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }


}
