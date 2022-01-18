package 입출력문제;

import java.util.Scanner;

public class ANS10991 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0 ; i < num ; i++){
            for(int k = 0 ; k < i; k++){
                System.out.print(" ");
            }
            for(int m = 0 ; m < (2*num)-1 ; m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
