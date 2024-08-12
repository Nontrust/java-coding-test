package programmers;

import java.util.*;
import java.lang.Math;

//https://school.programmers.co.kr/learn/courses/30/lessons/42839
public class P42839 {
    HashSet<Integer> checkedHash = new HashSet<Integer>();
    int answer = 0;
    public int solution(String numbers) {
        setAllNums("",numbers);
        Iterator<Integer> check = checkedHash.iterator();
        while (check.hasNext()) {
            int n = check.next();
            if(isPrime(n)) answer++;
        }

        return answer;
    }

    void setAllNums(String str, String dums){
        if(!str.equals(""))
            checkedHash.add(Integer.valueOf(str));

        for(int i = 0; i<dums.length(); i++){
            setAllNums(str + dums.charAt(i), dums.substring(0,i) + dums.substring(i+1));
        }

    }

    boolean isPrime(int n){
        if(n == 2) return true;
        if(n == 1 || n%2 ==0) return false;

        for(int i = 2; i<=Math.sqrt(n) ; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}