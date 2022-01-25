package DP;

import java.util.Scanner;


public class ANS11053 {

    static int N ;
    static int[] A, dp;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        A = new int[N];
        dp = new int[N];


        //수열 A의 값 채우기
        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
        }


        //dp
        for(int i = 0 ; i < N ; i++){
            dp[i] = 1; //초기화

            for(int j = 0 ; j < i ; j++){
                //j번째 원소가 i보다 작으면서 i번째 dp가 j번째  dp+1 값보다 작은 경우
                if(A[j] < A[i] && dp[i] < dp[j]+1){
                    dp[i] = dp[j] +1;
                }
            }
        }

        int max = -1;
        for(int i = 0 ; i < N ; i++){
            max = dp[i] > max? dp[i] : max;
        }

        System.out.println(max);


    }

}
