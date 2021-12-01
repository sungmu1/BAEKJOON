import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_10818 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = min;
        for(int i=0 ; i<N-1 ;i++){
            int temp = Integer.parseInt(st.nextToken());
            min = Math.min(min,temp);
            max = Math.max(max,temp);
        }
        System.out.println(min+ " " + max);
    }
}
