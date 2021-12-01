import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class bak_10870 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(Fibonnacci(Integer.parseInt(st.nextToken())));
    }

    public static int Fibonnacci(int n){
        if(n<=1)    return n;
        return Fibonnacci(n-2)+Fibonnacci(n-1);
    }
}
