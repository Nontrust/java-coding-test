package dfs;

import java.util.LinkedList;
import java.util.Queue;

public class Find_Cow {
    int result = 0;
    final int[] STEP = {1,-1,5};
    final int[] ch = new int[100001];
    Queue<Integer> queue = new LinkedList<>();

    private int Solution(int cur, int find){
        // check
        ch[cur] = 1;
        queue.offer(cur);
        int L = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0; i<len; i++){
                int queueCurrent =queue.poll();
                for (int j : STEP){
                    int move = queueCurrent + j;
                    if(move==find) return result+1;
                    if(move > 0 && move <= 10000 && ch[move]==0){
                        ch[move] = 1;
                        queue.offer(move);
                    }
                }
            }
            result++;
        }
        return 0;
    }


    public static void main(String[] args) {
        Find_Cow t = new Find_Cow();
        int solution = t.Solution(5, 14);

        System.out.println(solution);
    }
}
