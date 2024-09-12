package inflearn._1_simulation;

import java.util.Arrays;

public class Climb_the_ladder {
    public static void main(String[] args) {
        Climb_the_ladder c = new Climb_the_ladder();
        c.test();
    }

    public void test(){
        String[] t1 = solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}});
        String[] t2 = solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}});
        String[] t3 = solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}});
        String[] t4 = solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}});

        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));
        System.out.println(Arrays.toString(t3));
        System.out.println(Arrays.toString(t4));

        assert Arrays.equals(t1
                , new String[]{"D", "B", "A", "C", "E"}
        ): Arrays.toString(t1);
        assert Arrays.equals(t2
                , new String[]{"A", "C", "B", "F", "D", "G", "E"}
        ): Arrays.toString(t2);
        assert Arrays.equals(t3
                , new String[]{"C", "A", "B", "F", "D", "E", "H", "G"}
        ): Arrays.toString(t3);
        assert Arrays.equals(t4
                , new String[]{"C", "A", "F", "B", "D", "I", "E", "K","G", "L", "J", "H"}
        ): Arrays.toString(t4);
    }

    public String[] solution(int n, int[][] ladder){
        String[] result = new String[n];

        boolean[][] hasLine = new boolean[n][n];

        for(int i = 0 ; i< n; i++){
            result[i] = Character.toString('A' + i);
        }

        for(int i=0; i<ladder.length; i++){
            for(int j=0;j<ladder[i].length; j++){
                int col = ladder[i][j] - 1;
                result = swap(result, col, col+1);
            }
        }


        return result;
    }

    public String[] swap(String[] result, int i, int j ){
        String temp = result[i];
        result[i] = result[j];
        result[j] = temp;

        return result;
    }

}


