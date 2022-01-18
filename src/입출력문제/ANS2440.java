package 입출력문제;

import java.util.Scanner;

public class ANS2440 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int k = 1 ; k < num+1 ; k++){
            for(int i = num-k+1; i > 0 ; i--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
