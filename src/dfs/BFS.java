package dfs;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class BFS {
    Node root;
    private void bfs(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int rootLevel = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(rootLevel + " : ");
            for(int i=0; i<len; i++){
                Node current = Q.poll();
                System.out.print(current.data + " ");
                if(current.lt!=null) Q.offer(current.lt);
                if(current.rt!=null) Q.offer(current.rt);
            }
            rootLevel++;
            System.out.println();
        }
    }



    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.bfs(tree.root);
    }
}
