package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ANS9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for(int i = 0 ; i < T ; i++){
            List<String> list = new ArrayList<String>();
            String s= br.readLine();
            int index = 0;
            for(int j = 0 ; j < s.length() ; j++){
                if(list.isEmpty()){
                    list.add(String.valueOf(s.charAt(j)));
                    index++;
                }else{
                    if((s.charAt(j) == ')') && (list.get(index-1).equals(String.valueOf('(')))){
                        list.remove(index -1);
                        index--;
                    }else{
                        list.add(String.valueOf(s.charAt(j)));
                        index++;
                    }
                }

            }
            if(list.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
