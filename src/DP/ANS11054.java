package DP;

import java.util.Scanner;

public class ANS11054 {

    static int N;
    static int[] A, dp;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        //수열 A, 배열 dp 선언 및 초기화
        A = new int[N];
        dp = new int[N];

        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
            dp[i] = 1;
        }


        for(int i = 1; i < N ; i++){
            for(int j = 0; j < i ; j++){
                if(A[i] < A[j] && dp[i] < dp[j]){
                    dp[i] = dp[j] +1;
                    for(int k = j+1 ; k < i ; k++){
                        if (A[k] < A[j] && A[k] > A[i]){
                            dp[i] += 1;
                        }
                    }
                }
            }
        }

        int max = -1;
        for(int i = 0 ; i < N; i++){
            max = max < dp[i] ? dp[i] : max;
        }
        System.out.println(max);




    }
}
