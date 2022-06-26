package programers;

import java.util.HashMap;

public class ans키패드누르기 {

    public String solution(int[] numbers, String hand) {
        String answer = "";

        int left = 10;
        int right = 11;

        HashMap<Integer,String> keypad = new HashMap<Integer,String>();
        int n= 1; //처음 시작하는 숫자
        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                keypad.put(n,String.valueOf(i)+" "+String.valueOf(j));
                n++;

            }
        }

        keypad.put(0,"3 1");
        keypad.put(10,"3 0");
        keypad.put(11,"3 2");




        for(int num: numbers){
            switch(num){
                case 1 : case 4 : case 7:
                    answer += "L";
                    left = num;
                    break;
                case 3 : case 6 : case 9:
                    answer += "R";
                    right = num;
                    break;
                case 2 : case 5 : case 8: case 0:
                    String[] current = keypad.get(num).split(" ");
                    String[] leftidx = keypad.get(left).split(" ");
                    String[] rightidx = keypad.get(right).split(" ");

                    int currentx = Integer.parseInt(current[0]);
                    int currenty = Integer.parseInt(current[1]);
                    int leftx = Integer.parseInt(leftidx[0]);
                    int lefty = Integer.parseInt(leftidx[1]);
                    int rightx = Integer.parseInt(rightidx[0]);
                    int righty = Integer.parseInt(rightidx[1]);

                    if(Math.abs(currentx-leftx)+Math.abs(currenty-lefty)
                            > Math.abs(currentx-rightx) + Math.abs(currenty-righty)){
                        answer += "R";
                        right = num;
                    }else if(Math.abs(currentx-leftx)+Math.abs(currenty-lefty)
                            < Math.abs(currentx-rightx) + Math.abs(currenty-righty)){
                        answer += "L";
                        left = num;
                    }else if((Math.abs(currentx-leftx)+Math.abs(currenty-lefty)
                            == Math.abs(currentx-rightx) + Math.abs(currenty-righty))){
                        if(hand.equals("left")){
                            answer += "L";
                            left = num;
                        }else{
                            answer += "R";
                            right = num;
                        }
                    }
                    break;

            }
        }
        return answer;
    }
}
