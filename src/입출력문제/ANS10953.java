package 입출력문제;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ANS10953 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T ; i++){
            String[] s = sc.next().split(",");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);
            System.out.println(A+B);
        }
    }
}
