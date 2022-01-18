package 입출력문제;

import java.util.Scanner;

public class ANS2446 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0 ; i < num ; i++){

            for(int k = 0 ; k < i ; k++){
                System.out.print(" ");
            }
            for(int m = i ; m < (2*num-1)-i ; m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num-2; i >= 0 ; i--){
            for(int k = i ;k >0 ; k--){
                System.out.print(" ");
            }
            for(int m = i; m < (2*num-1)-i; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
