package programers;

import java.util.HashMap;
import java.util.HashSet;

public class ans신고결과받기 {

    public int[]  solution(String[] id_list, String[] report, int k){
        HashMap<String, HashSet<String>> reportHash = new HashMap<String, HashSet<String>>();
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        int[] answer = new int[id_list.length];

        for(String id:id_list){
            //초기화
            reportHash.put(id,new HashSet<String>());
            count.put(id,0);
        }

        for(String i : report){
            //report를 탐색하면서, reportHash와 count
            String[] tmp = i.split(" "); //report 원소를 " "로 문자열을 나눠 tmp 배열에 저장한다. tmp[0] = 신고한 사람, tmp[1] = 신고당한 사람

            if(!reportHash.get(tmp[0]).contains(tmp[1])){
                int cnt = count.get(tmp[1]); //count에서 신고당한 사람의 index를 가져온다.
                count.put(tmp[1], cnt+1);
                reportHash.get(tmp[0]).add(tmp[1]);
            }
        }

        for(int i = 0 ; i< id_list.length; i++){
            int cnt = 0; //answer에 들어가는 이메일 받는 횟수

            for(String s : reportHash.get(id_list[i])){
                if(count.get(s) >= k){
                    cnt++;
                }
            }

            answer[i] = cnt;
        }



        return answer;
    }

}
