import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class bak_1916 {
    
    public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int city_count = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int bus_count = Integer.parseInt(st.nextToken());

    int[][] bus = new int[city_count+1][city_count+1];
    for(int i=0 ; i<city_count+1 ; i++)
        Arrays.fill(bus[i],Integer.MAX_VALUE);

    int a_city =0, b_city =0, bus_price =0;
    for(int i=0 ; i<bus_count ;i++){
        st = new StringTokenizer(br.readLine());
        a_city = Integer.parseInt(st.nextToken());
        b_city = Integer.parseInt(st.nextToken());
        bus_price = Integer.parseInt(st.nextToken());

        bus[a_city][b_city] = Math.min(bus[a_city][b_city],bus_price);
    }
    //for(int i =0 ;i<city_count+1 ; i++)
    //    System.out.println(Arrays.toString(bus[i]));

    
    st = new StringTokenizer(br.readLine());
    int start_city = Integer.parseInt(st.nextToken());
    int end_city = Integer.parseInt(st.nextToken());
    int[] price = new int[city_count+1];
    Arrays.fill(price,Integer.MAX_VALUE);
    Stack<Integer> visit = new Stack<>();

    price[start_city] = 0;
    int now_city = 0;
    visit.add(start_city);

    while(!visit.isEmpty()){
        now_city = visit.pop();
        for(int i=0 ; i<city_count+1 ;i++)
            if(price[i] > bus[now_city][i] + price[now_city] && i!=now_city && bus[now_city][i] != Integer.MAX_VALUE){
                price[i] = bus[now_city][i] + price[now_city];
                visit.add(i);
            }
    }
    if(price[end_city] == Integer.MAX_VALUE)
        System.out.println(0);
    else
        System.out.println(price[end_city]);
    //System.out.println(Arrays.toString(price));
    //System.out.println(Arrays.toString(price));

    }
}
