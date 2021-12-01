
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class bak_2667 {
    public static int[][] axis = {{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int[][] town = new int[N][N];

        for(int i=0 ;i<N ;i++){
            st = new StringTokenizer(br.readLine());
            String tmp_string = st.nextToken();
            for(int j=0 ; j<N ;j++)
                town[i][j] = Integer.parseInt(tmp_string.substring(j,j+1));
        }

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<N ;i++){
            for(int j=0 ; j<N ;j++){
                if(town[i][j] == 1){
                    count++;
                    list.add(SearchTown(town,i,j));
                }
            }
        }
        
        System.out.println(count);
        Collections.sort(list);
        for(int i=0 ; i<list.size() ;i++)
            System.out.println(list.get(i));
    }
    public static int SearchTown(int[][] town, int x, int y){
        int count = 0;
        Stack<Integer> stack_x = new Stack<>();
        Stack<Integer> stack_y = new Stack<>();

        stack_x.add(x);
        stack_y.add(y);
        town[x][y] = 0;
        
        while(!stack_x.isEmpty()){
            x = stack_x.pop();
            y = stack_y.pop();
            
            count++;

            for(int[] ax : axis){
                try{
                    if(town[x + ax[0]][y + ax[1]] == 1){
                        town[x + ax[0]][y + ax[1]] = 0;
                        stack_x.add(x + ax[0]);
                        stack_y.add(y + ax[1]);
                    }
                }catch(ArrayIndexOutOfBoundsException e){

                }
                
            }
        }

        return count;
    }
}
