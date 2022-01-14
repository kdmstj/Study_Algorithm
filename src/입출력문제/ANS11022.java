package 입출력문제;

import java.util.Scanner;

public class ANS11022 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i = 0 ; i < num ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n" ,(i+1), a , b, (a+b));
        }
    }
}
