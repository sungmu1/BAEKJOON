import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_2884 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken()); //시간
        int min = Integer.parseInt(st.nextToken()); // 분

        if(min < 45){
            min+=60;
            hour-=1;
        }
        min-=45;

        if(hour==-1)
            hour = 23;


        System.out.print(hour+" "+min);
    }
}
