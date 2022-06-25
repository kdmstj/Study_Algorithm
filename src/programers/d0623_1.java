package programers;

public class d0623_1 {


    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        String arr = ""; // 10진법을 n진법으로 만들어 나열한 배열

        arr = f(n);


        for(int i = p-1 ; i < t*m ; i=i+m){
            answer += arr.charAt(i);
        }
        return answer;
    }

    public static String f(int n){
        String arr = "";

        for(int i = 0 ; i < 1000 ; i++){
            if(i/2 >= 2){
                arr += f(i/2)+(i%2);
            }else{
                arr += (i/2) + (i%2);
            }
        }

        return arr;
    }

    public static void main(String[] args){
        System.out.println(solution(2,4,2,1));
    }
}
