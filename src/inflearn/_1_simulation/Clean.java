package inflearn._1_simulation;

import java.util.Arrays;

public class Clean {
    public static void main(String[] args) {
        Clean c = new Clean();
        c.test();
    }

    public void test(){
        int[] t1 = solution(10, new int[][]{{0, 0, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 0, 0, 0}, {1, 0, 1, 0, 1}, {0, 0, 0, 0, 0}});
        int[] t2 = solution(20, new int[][]{{0, 0, 0, 1, 0, 1}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1}, {1, 1, 0, 0, 1, 0}, {0, 0, 0, 0, 0,0},{0, 0, 0, 0, 0, 0}});
        int[] t3 = solution(25, new int[][]{{0, 0, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 0,0}, {1, 0, 0, 0, 1}, {0, 0, 0, 0, 0}});

        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));
        System.out.println(Arrays.toString(t3));

        assert Arrays.equals(t1
                , new int[] {2,2}
        ): Arrays.toString(t1) + "실패" ;

        assert Arrays.equals(t2
                , new int[] {4,5}
        ): Arrays.toString(t2) + "실패";

        assert Arrays.equals(t3
                , new int[] {0,1}
        ): Arrays.toString(t3) + "실패";
    }

    int[][] mov = {{0,1},{1,0},{0,-1},{-1,0}};
    public int[] solution(int k, int[][] board){
        int curx = 0, cury =0, n = board.length;
        int vector = 0;

        while (k-->0){
            int nx = mov[vector%4][1] + curx, ny = mov[vector%4][0] + cury;
            if(isOnBoard(nx, ny, n) && board[ny][nx] == 0) {
                curx = nx; cury = ny;
            } else {
                vector++;
            }

        }
        return new int[]{cury,curx};
    }

    public boolean isOnBoard(int x, int y, int n){
        return x >= 0 && y >= 0 && x < n && y < n;
    }
}


