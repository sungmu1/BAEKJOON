import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_2581 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());

        int min=-1;
        int sum =0;
        for(int i=a ; i<=b ;i++){
            if(isPrime(i)){
                if(sum==0)
                    min = i;
                sum+=i;
                
            }
        }
        if(sum == 0)
            System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static boolean isPrime(int a){
        if(a==1)
            return false;
        for(int i=2; i<=a/2 ; i++){
            if(a%i == 0)
                return false;
        }

        return true;
    }
        
}
