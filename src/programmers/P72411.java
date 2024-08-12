package programmers;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/72411
public class P72411 {
    public HashMap<String, Integer> map = new HashMap<>();

    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> answerList = new ArrayList<>();

        // 1. order 정렬
        for(int i = 0; i<orders.length; i++){
            char[] c = orders[i].toCharArray();
            Arrays.sort(c);
            orders[i] = String.valueOf(c);
        }
        // 2. 조합 생성
        for(int corseLength: course){
            for(String order: orders){
                combine("", order, corseLength);
            }

            //가장 많은 조합조합 생성
            if(!map.isEmpty()){
                ArrayList<Integer> list = new ArrayList(map.values());
                int max = Collections.max(list);

                if(max>1){
                    Iterator<String> iter = map.keySet().iterator();
                    while(iter.hasNext()){
                        String key = iter.next();
                        if(max == map.get(key)){
                            answerList.add(key);
                        }
                    }
                }
                map.clear();
            }
        }
        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];

        for(int i = 0 ; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    void combine(String order, String remainOrder, int count){
        if(count == 0){
            map.put(order, map.getOrDefault(order, 0)+1);
            return;
        }

        for(int i = 0; i<remainOrder.length(); i++){
            combine(
                    order+remainOrder.charAt(i)
                    ,remainOrder.substring(i+1)
                    ,count-1);
        }
    }
}
