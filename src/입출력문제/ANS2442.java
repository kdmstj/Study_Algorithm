package 입출력문제;

import java.util.Scanner;

public class ANS2442 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1 ; i < num+1 ; i++){
            for(int k = 1 ; k < ((2*num-1)-(2*i-1))/2 +1 ; k++){
                System.out.print(" ");
            }
            for(int m = 1 ; m < (2*i-1)+1 ; m++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
