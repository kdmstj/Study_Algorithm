package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ANS10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<String>();
        int index = 0;

        for(int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")){
                list.add(st.nextToken());
                index++;
            }
            else if(str.equals("pop")){
                if(list.isEmpty()){
                    System.out.println("-1");
                }
                else{
                    System.out.println(list.get(index-1));
                    list.remove(index-1);
                    index--;
                }

            }
            else if(str.equals("size")){
                System.out.println(list.size());
            }
            else if(str.equals("empty")){
                if(list.isEmpty()){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            else if(str.equals("top")){
                if(list.isEmpty()){
                    System.out.println("-1");
                }
                else{
                    System.out.println(list.get(index-1));
                }

            }
        }
    }
}
