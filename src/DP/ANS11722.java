package DP;

import java.util.Scanner;

public class ANS11722 {

    static int N;
    static int[] A, dp;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        //수열 A , 배열 dp 선언 및 초기화
        dp= new int[N];
        A = new int[N];
        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
            dp[i] = 1;
        }



        for(int i = 1 ; i < N ; i++){
            for(int j = 0 ; j < i ; j++){

                if(A[j] > A[i] && dp[i] < dp[j] +1){
                    dp[i] = dp[j] +1;
                }
            }
        }


        int max = -1;
        for(int i = 0 ; i < N; i++){
            System.out.println(dp[i]);
            if(max < dp[i]){
                max = dp[i];
            }
        }
        System.out.println(max);

    }
}
