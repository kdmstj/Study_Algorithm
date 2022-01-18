package 입출력문제;

import java.util.Scanner;

public class ANS1924 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int i = 0;
        int k = 0;
        int day = 1;


        while(true){
            if(i == x && y == k){
                break;
            }
            for(i = 1 ; i < 13; i ++){
                if(i%2 != 0){
                    for(k = 1; i< 32 ; k++) {

                        day++;

                    }
                }
                else if(i == 2){
                    for(k = 1; k < 29; k++){
                        day++;
                    }
                }
                else{
                    for(k = 1; k < 30 ;k++){
                        day++;
                    }
                }
            }
        }


        System.out.println(day);

        if( day % 7 == 1){
            System.out.println("MON");
        }
        else if(day % 7 == 2){
            System.out.println("TUE");
        }
        else if(day % 7 == 3){
            System.out.println("WED");
        }
        else if(day % 7 == 4){
            System.out.println("THU");
        }
        else if(day % 7 == 5){
            System.out.println("FRI");
        }
        else if(day % 7 == 6){
            System.out.println("SAT");
        }
        else if(day % 7 == 0){
            System.out.println("SUN");
        }


    }
}
