import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_2294 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int goal_price = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];
        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            coin[i] = Integer.parseInt(st.nextToken());
        }

        int[] map = new int[goal_price+1];
        for(int coin_value : coin){
            if(coin_value > goal_price)
                continue;

            map[coin_value]=1;

            for(int i =coin_value+1 ; i<=goal_price ; i++){
                if(map[i-coin_value] !=0 ){
                    if(map[i] > 0)
                        map[i] = Math.min(map[i-coin_value] + 1, map[i]);
                    else
                        map[i] = map[i-coin_value] + 1;

                }
            }
        }
        if(map[goal_price]> 0 )
        System.out.println(map[goal_price]);
        else
        System.out.println(-1);
    }
    
}
