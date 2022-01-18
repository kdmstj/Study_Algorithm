package 입출력문제;

import java.util.Scanner;

public class ANS2445 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1 ; i < num+1; i++){
            for(int k = 0 ; k < i ; k++){
                System.out.print("*");
            }
            for(int m = i ; m < 2*num-i ; m++){
                System.out.print(" ");
            }
            for(int n = 2*num-i ; n < 2*num ; n++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num-1; i > 0 ; i--){
            for(int k = 0 ; k < i ; k++){
                System.out.print("*");
            }
            for(int m = i; m < 2*num-i; m++){
                System.out.print(" ");
            }
            for(int n = 2*num-i ; n < 2*num ; n++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
