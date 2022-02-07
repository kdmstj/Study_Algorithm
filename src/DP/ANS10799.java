package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ANS10799 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(solve(st.nextToken()));

    }


    public static int solve(String s){
        Stack<Character> stack = new Stack<Character>();
        String arr[] = new String[s.length()];

        int result = 0;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            arr[i] = String.valueOf(c);

            if(c == '('){
                stack.push(c);
            }
            else if( c == ')'){
                stack.pop();
                if(arr[i-1].equals("(")){
                    result += stack.size();
                }
                else{
                    result += 1;
                }
            }
        }
        return result;

    }
}
