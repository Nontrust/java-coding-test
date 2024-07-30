package dfs;

import java.util.Scanner;

public class AdjacencyMatrix {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch = new int[10000];


    public static void main(String[] args) {
        AdjacencyMatrix t = new AdjacencyMatrix();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n+1][n+1];
        for (int i = 0; i<m; i++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b]=1;
        }

        ch[1]=1;
        t.DFS(1);

        System.out.println(answer);




    }

    private void DFS(int i) {
    }
}
