import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bak_1806 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        //int[] sum = new int[N];
        int[] number = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0 ;i < N ; i++)
            number[i] = Integer.parseInt(st.nextToken());

        int start=0 ,end =0;
        int sum =number[0];
        int min_length = 100001;
        while(true){
            if(sum < S){
                end++;
                if(end>=N)
                    break;
                sum += number[end];
            }
            else if(sum >= S){
                sum -= number[start];
                start++;
                if(end==N-1 && end<start){
                    break;
                }
            }
            
            if(sum >= S){
                min_length = Math.min(end-start+1,min_length);
              //  System.out.println(start+","+end);
            }
        }
        if(min_length==100001)
            System.out.println(0);
        else
            System.out.println(min_length);
        /*boolean check = false;
        for(int i=0 ; i<N ; i++){
            for(int j=0; j<N-i ;j++){
                sum[j] = sum[j] + number[j+i];
                if(sum[j] >= S){
                    System.out.println(i+1);
                    check = true;
                    break;
                }
            }
            //System.out.println(Arrays.toString(sum));
            if(check) break;
        }
        if(!check)
            System.out.println(0);
          */  
    }
    
}
