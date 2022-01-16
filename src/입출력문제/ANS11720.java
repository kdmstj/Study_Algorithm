package 입출력문제;

import java.util.Scanner;

public class ANS11720 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //숫자의 갯수
        int N = sc.nextInt();

        //숫자
        String str = sc.next();


        int sum = 0;
        //숫자 N개의 합
        for(int i = 0 ; i < N; i++){
            sum += Integer.parseInt(str.substring(i,i+1));
        }
        System.out.println(sum);

    }
}
