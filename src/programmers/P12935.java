package programmers;

import java.util.Arrays;
import java.util.OptionalInt;

public class P12935 {
    public static void main(String[] args){
        P12935 i = new P12935();
    }
    public class solution{
        public int[] solution(int[] arr) {
            int min = Arrays.stream(arr).min().getAsInt();
            int[] answer = Arrays.stream(arr).filter(a -> a != min).toArray();


            return answer.length == 0 ? new int[]{-1} : answer;
        }
    }

}
