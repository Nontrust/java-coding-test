package dfs;

public class 피보나치 {
    public int fibo(int n){
        if(n==1) return 1;
        else if(n==2) return 1;
        else return fibo(n-2)+fibo(n-1);
    }

    public static void main(String[] args) {
        피보나치 T = new 피보나치();
        int fibo = T.fibo(20);
        System.out.println(fibo);
    }
}
