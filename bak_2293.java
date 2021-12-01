import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bak_2293 {
    public static int goal_price;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        goal_price = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];
        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            coin[i] = Integer.parseInt(st.nextToken());
        }

        int[] map = new int[goal_price+1];
        for(int coin_value : coin){
            if(coin_value > goal_price)
                continue;
            map[coin_value]++;
            for(int i =coin_value ; i<=goal_price ; i++){
                map[i] += map[i-coin_value];
            }
        }
        

        System.out.println(map[goal_price]);
    }
    
}
