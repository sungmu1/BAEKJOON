import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_17070 {
    public static int[][] load;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        load = new int[N][N];

        for(int i=0  ;i <N ;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j<N ;j++){
                if(Integer.parseInt(st.nextToken()) == 1)
                    load[i][j] = 0;
                else
                    load[i][j] = -1;
            }
        }
        if(load[N-1][N-1] != 0)
            load[N-1][N-1]=1;
        System.out.println(DP(0,1,1));
    }


    //state = 1:가로, 2:세로, 3:대각선
    public static int[] axis = {1,0,-1,0};
    public static int DP(int x, int y, int state){
        int ans = 0;

        if(load[x][y] != -1 && load[x][y] != 0)
            return load[x][y];
        
        if(state == 1){
            try{
                if(load[x][y+1] != 0)
                    ans += DP(x,y+1,1);
            }catch(ArrayIndexOutOfBoundsException e){}
            try{
                if(load[x+1][y+1] != 0 && load[x+1][y] != 0 && load[x][y+1] != 0)
                    ans += DP(x+1,y+1,3);
            }catch(ArrayIndexOutOfBoundsException e){}
        }
        else if(state == 2){
            try{
                if(load[x+1][y] != 0)
                    ans += DP(x+1,y,2);
            }catch(ArrayIndexOutOfBoundsException e){}
            try{
                if(load[x+1][y+1] != 0 && load[x+1][y] != 0 && load[x][y+1] != 0)
                    ans += DP(x+1,y+1,3);
            }catch(ArrayIndexOutOfBoundsException e){}
        }
        else if(state == 3){
            try{
                if(load[x][y+1] != 0)
                    ans += DP(x,y+1,1);
            }catch(ArrayIndexOutOfBoundsException e){}
            try{
                if(load[x+1][y] != 0)
                    ans += DP(x+1,y,2);
            }catch(ArrayIndexOutOfBoundsException e){}
            try{
                if(load[x+1][y+1] != 0 && load[x+1][y] != 0 && load[x][y+1] != 0)
                    ans += DP(x+1,y+1,3);
            }catch(ArrayIndexOutOfBoundsException e){}
        }

        return ans;
    }
    
}
