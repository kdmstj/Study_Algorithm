package 입출력문제;

import java.util.Scanner;

public class ANS2522 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1 ; i < num ; i++){
            for(int k = 0 ; k < num-i ; k++){
                System.out.print(" ");
            }
            for(int m = num-i ; m < num ; m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num ; i > 0 ; i--){
            for(int k = 0 ; k < num-i ; k++){
                System.out.print(" ");
            }
            for(int m = num-i ; m < num ; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
