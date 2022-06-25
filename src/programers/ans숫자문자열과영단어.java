package programers;

import java.util.HashMap;

public class ans숫자문자열과영단어 {

    public static int solution(String s) {
        int answer = 0;
        String result ="";

        HashMap<String,Integer> dic = new HashMap<String, Integer>();
        dic.put("zero",0);
        dic.put("one",1);
        dic.put("two",2);
        dic.put("three",3);
        dic.put("four",4);
        dic.put("five",5);
        dic.put("six",6);
        dic.put("seven",7);
        dic.put("eight",8);
        dic.put("nine",9);

        String tmp ="";
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                result += s.charAt(i);
                System.out.println("hi1"+result);
            }
            else{
                tmp += s.charAt(i);
                System.out.println("hi3"+tmp);
                if (dic.containsKey(tmp)) {
                    result += dic.get(tmp);
                    tmp = "";
                    System.out.println("hi2"+tmp);
                }
            }

        }

        answer = Integer.parseInt(result);

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("93three3fourzero0"));
    }
}
