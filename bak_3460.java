import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class bak_3460 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());

        for(int j=0 ; j<K ;j++){
            
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 숫자 개수
            int i=0;
            if(N<=1){
                System.out.println(0);
                continue;
            }
                
            while(true){
                if(N%2 == 1){
                    System.out.print(i+" ");
                }
                N/=2;            
                i++;
                if(N==1){
                    System.out.println(i);
                    break;
                }
            }
        }
        
    }
}
