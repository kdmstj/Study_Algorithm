package 입출력문제;

import java.util.Scanner;

public class ANS11718 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str.startsWith("") || str.endsWith("") || str.length() > 100 || str.isEmpty()){
                break;
            }else{
                System.out.println(str);
            }

        }
        sc.close();
    }
}
