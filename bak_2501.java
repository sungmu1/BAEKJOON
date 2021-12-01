import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class bak_2501 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken()); // 숫자 개수
        int K = Integer.parseInt(st.nextToken());

        int answer = 0;
        for(int i=1 ; i<=N/2 ;i++){
            if(N%i == 0 && K!=0){
                K--;
            if(K==0)
                {answer = i; break;}
            }
        }
        if(K==1)
            answer =N;
        System.out.println(answer);
    }
    
    
}