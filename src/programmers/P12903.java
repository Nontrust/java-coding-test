package programmers;

import java.util.Arrays;

public class P12903 {
    public static void main(String[] args){
        P12903 i = new P12903();
    }
    public class solution{
        public String solution(String s) {
            String answer = "";
            if(s.length()%2 == 0){
                answer += s.charAt(s.length()/2-1 );
                answer += s.charAt(s.length()/2);
            }else{
                return s.charAt(s.length()/2)+"";
            }

            return answer;
        }
    }

}
