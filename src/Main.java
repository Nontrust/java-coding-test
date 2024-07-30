import java.util.PriorityQueue;

public class Main {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(Integer i : scoville){
            queue.add(i);
        }
        while(queue.peek()<K){
            if(queue.size()==1) return -1;
            queue.add(queue.poll()+queue.poll()*2);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
//        System.out.println(main.solution(new int[]{1, 2, 3, 4, 5}));


    }
}