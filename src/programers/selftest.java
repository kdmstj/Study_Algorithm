package programers;

import java.util.Arrays;
import java.util.Scanner;

public class selftest {

    static int[] arr; //입력 배열
    static int[] resultArr; //결과 배열

    public static void main(String[] args){

        //arr 객체 생성
        //arr = new Integer[];

        //arr 초기화
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 100 ; i++){
            arr[i] = sc.nextInt();
        }

        //solution 함수 결과 print
        System.out.println(solution(arr));


    }


    static int[] solution(int[] arr){

        //체크하는 숫자 배열
        int[] numArr = new int[100];
        int idx = 0; //numArr 인덱스

        for(int i = 0 ; i < arr.length; i++){
            if(Arrays.asList(numArr).contains(arr[i])){

            }else{
                //포함되지 않았을 경우,
                int num = arr[i];
                numArr[idx] = num;
                int count = 0 ; //count 0으로 초기화

                for(int j = i ; j < arr.length; j++){
                    if(num == arr[j]){
                        count++;
                    }
                }


            }

        }



        return resultArr;

    }
}
