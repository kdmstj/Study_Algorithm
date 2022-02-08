package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ANS10845 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> queue = new ArrayList<Integer>();
        int index = 0;

        for(int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")){
                queue.add(Integer.valueOf(st.nextToken()));
                index++;
            }
            else if(s.equals("pop")){
                if(queue.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(queue.get(0));
                    queue.remove(0);
                    index--;
                }
            }
            else if(s.equals("size")){
                System.out.println(queue.size());
            }
            else if(s.equals("empty")){
                if(queue.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
            else if(s.equals("front")){
                if(queue.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(queue.get(0));
                }
            }
            else if(s.equals("back")){
                if(queue.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(queue.get(index-1));
                }
            }
        }
    }


}
