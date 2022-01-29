package DP;

import java.util.Scanner;

public class ANS2750 {

    static int N , tmp;
    static int[] arr;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N+1];
        for(int i = 0 ; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < N-1 ; i++){
            for(int j = i+1 ; j < N; j++){
                if(arr[i] > arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for(int i = 0 ; i < N; i++){
            System.out.println(arr[i]);
        }
    }
}
