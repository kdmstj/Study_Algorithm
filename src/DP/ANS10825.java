package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class ANS10825 {

    static String[][] dp;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        dp = new String[N][4];
        for(int i = 0 ; i  < N; i++){
            dp[i] = br.readLine().split(" ");
        }

        Arrays.sort(dp, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                //국어 점수가 같을 경우
                if(Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])){
                    //영어 점수가 같을 경우
                    if(Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])){
                        //수학 점수가 같을 경우
                        if(Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])){
                            //이름 증가순으로 나열한다.
                            return o1[0].compareTo(o2[0]);
                        }
                        //수학 점수가 다를 경우, 감소하는 순서로
                        else{
                            return Integer.compare(Integer.parseInt(o2[3]), Integer.parseInt(o1[3]));
                        }
                    }//영어 점수가 다를 경우, 증가하는 순서대로
                    else{
                        return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
                    }
                }//국어 점수가 다를 경우, 감소하는 순서대로
                else{
                    return Integer.compare(Integer.parseInt(o2[1]), Integer.parseInt(o1[1]));
                }

            }
        });

        for(int i = 0 ; i < N; i++){
            System.out.println(dp[i][0]);
        }

    }
}
