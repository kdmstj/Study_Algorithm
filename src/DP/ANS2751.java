package DP;

import java.util.Scanner;

public class ANS2751 {

    static int N;
    static int[] dp,arr;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N];
        dp = new int[N];
        for(int i = 0 ; i < N; i++){
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        for(int i = 1 ; i < N; i++){
            for(int j = 1 ; j < i; j++){
                if(arr[i] > dp[i-j]){
                    dp[i-j+1] = arr[i];
                }
                else{//arr[i] < dp[i-j]

                }
            }
        }

    }
}
