package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class P12910 {
    public static void main(String[] args){
        P12910 i = new P12910();
    }
    public class solution{
        public List<Integer> solution(int[] arr, int divsor){
            List<Integer> answer = new LinkedList<>();
            for(int a : arr){
                if(a%divsor == 0){
                    answer.add(a);
                }
            }

            if(answer.isEmpty()){
                answer.add(-1);
            }
            Collections.sort(answer);

            return answer;
        }
    }

}
