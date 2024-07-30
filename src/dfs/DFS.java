package dfs;

public class DFS {
    static int n = 10;
    static int[] ch = new int[n+1];

    public void dfs(int l){
        if(l==n+1) {
            StringBuilder temp = new StringBuilder();
            for(int i =1; i<=n; i++){
                if(ch[i]==1) temp.append(i).append(" ");
            }
            if(!temp.isEmpty()) System.out.println(temp.toString());
        }
        else {
            ch[l] = 1;
            dfs(l+1);
            ch[l] = 0;
            dfs(l+1);
            System.out.println("check");
        }
    }

    public static void main(String[] args) {
        DFS T = new DFS();
        T.dfs(1);



    }


}
