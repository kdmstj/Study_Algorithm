package 입출력문제;

import java.util.ArrayList;
import java.util.Scanner;

public class ANS10950 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();

        int num;
        num = sc.nextInt();

        for (int i = 0 ;  i < num; i++){

            int num1, num2 = 0;

            num1 = sc.nextInt();
            num2 = sc.nextInt();
            list.add(num1+num2);
        }

        for (int i = 0 ; i < num ; i++){
            System.out.println(list.get(i));
        }



    }
}
