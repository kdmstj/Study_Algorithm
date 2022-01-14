package 입출력문제;

import org.w3c.dom.css.ElementCSSInlineStyle;

import java.util.ArrayList;
import java.util.Scanner;


public class ANS10952 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(a+b);

            if(a == 0 && b == 0){
                for(int i = 0 ; i < list.size()-1 ; i++){
                    System.out.println(list.get(i));
                }
                break;

            }


        }

    }
}
