import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class bak_2609 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int chk=1;
        for(int i=2 ; i<=Math.min(a,b) ; i++){//최대공약수
            while(a%i == 0 && b%i == 0){
                chk*=i; a/=i; b/=i; }
        }
        System.out.println(chk);
        System.out.print(chk*a*b);

    }
    
}
