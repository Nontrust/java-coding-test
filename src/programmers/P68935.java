package programmers;

public class P68935 {
    public static void main(String[] args){
        P68935 i = new P68935();
    }
    public class solution{
        public int solution(int n) {
            int answer = 0;
            StringBuilder sb = new StringBuilder();
            while(n>0){
                sb.append(n%3);
                n = n/3;
            }
            char[] ch = sb.toString().toCharArray();
            int h = 1;
            for(int i = ch.length-1 ; i>0 ; i--){
                answer += h*(ch[i]-'0');
                h*=3;
            }
            return answer;
        }
    }

}
