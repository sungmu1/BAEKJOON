import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_1292 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int count = 1;
        int tmp =0;
        int sum =0;
        for(int i=1 ; i<=end ; i++){

            if(count!=tmp)
                tmp++;
            else
            {    count++; tmp = 1; }
            
            if(i>=start)
                sum+=count;
            
        }
        System.out.print(sum);
    }
    

}
