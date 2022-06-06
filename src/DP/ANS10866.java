package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ANS10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> deque = new ArrayList<Integer>();
        int N = Integer.parseInt(br.readLine());
        int front = 0 , rear = 0;

        for(int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push_front")){
                for(int j = front; j < deque.size(); j++){
                    int temp = deque.get(j);
                    deque.add(j+1,temp);
                }
            }else if(s.equals("push_back")){

            }else if(s.equals("pop_front")){

            }else if(s.equals("pop_back")){

            }else if(s.equals("size")){

            }else if(s.equals("empty")){

            }else if(s.equals("front")){

            }else if(s.equals("back")){

            }
        }
    }
}
