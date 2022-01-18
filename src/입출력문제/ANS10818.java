package 입출력문제;

import java.util.ArrayList;
import java.util.Scanner;

public class ANS10818 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();

        int num = sc.nextInt();

        //N개의 정수 입력
        for(int i = 0 ; i < num ; i++){
            int element = sc.nextInt();
            list.add(element);
        }

        //최솟값 구하기;
        int min = (int)list.get(0);
        for(int i = 0 ; i < num ; i++){
            if((int)list.get(i) < min){
                min =(int)list.get(i);
            }
        }

        //최댓값 구하기
        int max = (int)list.get(0);
        for(int i = 0 ; i < num ; i++){
            if(max < (int)list.get(i)){
                max = (int)list.get(i);
            }
        }

        System.out.printf("%d %d",min, max);


    }
}
