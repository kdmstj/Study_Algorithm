package 입출력문제;

import java.util.Scanner;

public class ANS2439 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i < num+1 ; i++){
            for(int k = 1; k < num-i+1 ; k++){
                System.out.print(" ");
            }
            for(int m = num-i+1 ; m < num+1 ; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
