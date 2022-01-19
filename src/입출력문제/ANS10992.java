package 입출력문제;

import java.util.Scanner;

public class ANS10992 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i < num; i++){
            for(int k = num-i; k > 0 ; k--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int n = 0 ; n < 2*(i-1)-1 ; n++){
                System.out.print(" ");
            }
            if(i != 1){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 2*num-1; i++){
            System.out.print("*");
        }
    }
}
