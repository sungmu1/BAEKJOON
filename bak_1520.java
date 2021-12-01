import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_1520 {
    public static int[][] load;
    public static int[][] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        load = new int[height][width];
        dp = new int[height][width];

        for(int i=0 ; i<height ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0 ;j<width ;j++){
                load[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }

        dp[height-1][width-1] = 1;
        System.out.println(search(0,0));

        

    }
    
    public static int[] axis = {1,0,-1,0};
    public static int search(int x, int y){
        int ans=0;
        if(dp[x][y] != -1)
            return dp[x][y];
        
        for(int i=0 ; i<4 ; i++){
            try{
                if(load[x][y] > load[x+axis[i]][y+axis[3-i]])
                    ans += search(x+axis[i] , y+axis[3-i]);
            }catch(ArrayIndexOutOfBoundsException e){}
        }
        dp[x][y] = ans;
        return ans;
    }
        
}
