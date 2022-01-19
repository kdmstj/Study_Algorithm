package 입출력문제;

import java.util.Scanner;

public class ANS10991 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1 ; i < num+1 ; i++){
            for(int k = num-i ; k > 0  ; k--){
                System.out.print(" ");
            }
            for(int m = 1; m <i+1 ; m++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
