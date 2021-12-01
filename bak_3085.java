import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bak_3085 {
    public static int N;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        char[][] box = new char[N][N];

        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();
            for(int j=0 ; j<N ; j++)
                box[i][j] = tmp.charAt(j);
        }
        char tmp;
        char tmp2;
        int max =0,tmp_max;
        for(int i=0 ; i<N ; i++){//행
            for(int j=0 ; j<N ; j++){ // 칸   
                tmp = box[i][j];
                tmp2='l'; 
                if(i-1>0 && tmp != box[i-1][j]){
                    box[i][j] = box[i-1][j];
                    char save_change = box[i-1][j];
                    box[i-1][j] = tmp;
                    //search box[i]
                    max = Math.max(max,check_hang(box[i]));
                    tmp_max=1;
                    for(int k=0 ; k<N;k++){
                        if(tmp2 == box[k][j])
                            tmp_max++;
                        else
                            tmp_max=1;
                        max = Math.max(tmp_max,max);
                        tmp2 = box[k][j];
                    }
                    box[i-1][j] = save_change;
                }
                tmp2='l'; 
                if(i+1<N && tmp != box[i+1][j]){
                    box[i][j] = box[i+1][j];
                    char save_change = box[i+1][j];
                    box[i+1][j] = tmp;
                    //search box[i]
                    max = Math.max(max,check_hang(box[i]));
                    tmp_max=1;
                    for(int k=0 ; k<N;k++){
                        if(tmp2 == box[k][j])
                            tmp_max++;
                        else
                            tmp_max=1;
                        max = Math.max(tmp_max,max);
                        tmp2 = box[k][j];
                    }
                    
                    box[i+1][j] = save_change;
                }

                tmp2='l'; 
                if(j-1>0 && tmp != box[i][j-1]){
                    box[i][j] = box[i][j-1];
                    char save_change = box[i][j-1];
                    box[i][j-1] = tmp;
                    //search box[][j]
                    max = Math.max(max,check_hang(box[i]));
                    tmp_max=1;
                    for(int k=0 ; k<N;k++){
                        if(tmp2 == box[k][j])
                            tmp_max++;
                        else
                            tmp_max=1;
                        max = Math.max(tmp_max,max);
                        tmp2 = box[k][j];
                    }
                    
                    box[i][j-1] = save_change;
                }

                tmp2='l'; 
                if(j+1<N && tmp != box[i][j+1]){
                    box[i][j] = box[i][j+1];
                    char save_change = box[i][j+1];
                    box[i][j+1] = tmp;
                    //search box[][j]
                    max = Math.max(max,check_hang(box[i]));
                    tmp_max=1;
                    for(int k=0 ; k<N;k++){
                        if(tmp2 == box[k][j])
                            tmp_max++;
                        else
                            tmp_max=1;
                        max = Math.max(tmp_max,max);
                        tmp2 = box[k][j];
                    }
                    box[i][j+1] = save_change;
                }

                box[i][j] = tmp;
                max = Math.max(max,check_hang(box[i]));

                tmp2='l'; 
                tmp_max=1;
                for(int k=0 ; k<N; k++){
                    if(tmp2 == box[i][k])
                        tmp_max++;
                    else
                        tmp_max=1;
                    max = Math.max(tmp_max,max);
                    tmp2 = box[i][k];
                }
            }
        }
        
        System.out.println(max);

    }

    public static int check_hang(char[] box){
        int max =0;

        char tmp2='l'; 
        int tmp_max=1;
        for(int k=0 ; k<N;k++){
            if(tmp2 == box[k])
                tmp_max++;
            else
                tmp_max=1;
            max = Math.max(tmp_max,max);
            tmp2 = box[k];
        }

        return max;
    }
    public static int check_yul(char[] box){
        int max =0;
        return max;
    }

}
