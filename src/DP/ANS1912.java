package DP;

import java.util.Scanner;

public class ANS1912 {

    static int N;
    static long[] dp, A;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //N입력
        N = sc.nextInt();

        //수열 A, 배열 dp 선언 및 초기화
        A = new long[N];
        dp = new long[N];
        for(int i = 0 ; i < N ;i++){
            A[i] = sc.nextInt();
            dp[i] = 0;
        }
        dp[0] = A[0];

        for(int i = 1 ; i < N ; i++){
            if(dp[i-1] + A[i] > A[i]){
                dp[i] = dp[i-1] + A[i];
            }
            else{
                dp[i] = A[i];
            }
        }


        long max = -1;
        for(int i = 0 ; i < N; i++){
            max = max < dp[i]  ? dp[i] : max;
        }

        System.out.println(max);


    }
}
