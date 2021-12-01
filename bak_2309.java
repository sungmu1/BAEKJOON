import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class bak_2309 {
   
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] nan = new int[9];
        int[] answer = new int[7];
        for(int i=0 ; i<9 ;i++){
            st = new StringTokenizer(br.readLine());
            nan[i] = Integer.parseInt(st.nextToken());
        }
        Comb(nan,answer,7,0);
    } 
    public static void Comb(int[] array, int[] answer,int count,int pin){
        if(pin == 9 && count!=0)
            pin=0;
        else if(count == 0){
            int sum=0;
            for(int i=0 ; i<7 ;i++)
                sum += answer[i];
            if(sum == 100){
                Arrays.sort(answer);
                for(int i=0 ; i<7 ;i++)
                    System.out.println(answer[i]);
            }

        }
        else{
            Comb(array, answer, count,pin+1);
            count--;
            answer[count] = array[pin];
            Comb(array, answer, count, pin+1);
        }
    }
}
