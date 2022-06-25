package Boostcamp;

public class ans신규아이디추천 {



    static class Solution {
        public static String solution(String new_id) {
            //1단계
            //1단계
            new_id = new_id.toLowerCase();

            //2단계
            String ans1 = "";
            for(int i = 0; i < new_id.length(); i++){
                char ch = new_id.charAt(i);
                if(ch >= 'a' && ch <= 'z'){
                    ans1 += String.valueOf(ch);
                }else if( ch >= '0' && ch <= '9'){
                    ans1 += String.valueOf(ch);
                }else if(ch == '.' || ch == '_' || ch == '-'){
                    ans1 += String.valueOf(ch);
                }
            }

            //3단계
            for(int i = 0; i < ans1.length(); i++){
                if(ans1.charAt(i) == '.'){
                    String s =".";
                    int n = i+1;
                    while(n != ans1.length() && ans1.charAt(n) == '.'){
                        s += ".";
                        n++;
                    }
                    if(s.length() > 1){
                        ans1 = ans1.replace(s,".");
                    }
                }
            }


            //4단계
            if(ans1.startsWith(".")){
                ans1 = ans1.substring(1,ans1.length());
            }
            else if(ans1.endsWith(".")){
                ans1 = ans1.substring(0,ans1.length()-1);
            }

            //5단계
            if(ans1.length() == 0){
                ans1 += 'a';
            }

            //6단계
            if(ans1.length() >= 16){
                ans1 = ans1.substring(0,15);
            }
            if(ans1.endsWith(".")){
                ans1 = ans1.substring(0,ans1.length()-1);
            }

            //7단계
            char n = ans1.charAt(ans1.length()-1);
            if(ans1.length() <= 2){
                while(ans1.length() < 3){
                    ans1 += n;
                }
            }

            return ans1;
        }


    }

    public static void main(String[] args){
        System.out.println(Solution.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(Solution.solution("z-+.^."));
        System.out.println(Solution.solution("=.="));
        System.out.println(Solution.solution("123_.def"));
        System.out.println(Solution.solution("abcdefghijklmn.p"));

    }


}
