package DP;

import java.io.*;
import java.util.Arrays;


public class ANS2751 {

    static int N;
    static Integer[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new Integer[N];
        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N; i++){
            sb.append(arr[i] +"\n");
        }

        System.out.println(sb);
    }
}
