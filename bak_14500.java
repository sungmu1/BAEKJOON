import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class bak_14500 { //미완성(입력까지만 함)
    public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(),"\n");
            int N,M;
            String[] line = st.nextToken().split(" ");
            String a = line[0];
            String b = line[1];
        
            N = Integer.parseInt(a);
            M = Integer.parseInt(b);
            
            String[] tmp = new String[M];
            Arrays.fill(tmp,"0");

            int[][] str = new int[N][M];

            for(int i=0 ; i<N ; i++){
                tmp[i] = br.readLine();
                tmp = tmp[i].split(" ");
                for(int j=0 ; j<M ; j++){
                    str[i][j] = Integer.parseInt(tmp[j]);
                }
                
            }
    }

    
}
