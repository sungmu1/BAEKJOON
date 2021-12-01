import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_2460 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int people=0;
        int max = 0;
        for(int i =0 ; i<10 ;i++){
            st = new StringTokenizer(br.readLine());
            int dead = Integer.parseInt(st.nextToken());
            int born = Integer.parseInt(st.nextToken());
            people = people-dead+born;
            max = Math.max(people,max);
        }
        System.out.println(max);
    }
}
