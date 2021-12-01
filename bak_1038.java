import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class bak_1038 {
    public static int count;
    public static int N;
    public static boolean pin;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        N = Integer.parseInt(str);

        int[] number = new int[10];
        Arrays.fill(number,-1);
        count = 0;
        pin = true;

        for(int i=1 ; i<1023;i++){
            if(N == 0){
                System.out.println(N);
                pin = false;
                break;
            }
            else if(i/10 == 0){
                count++;
                if(N == i){
                    System.out.println(N);

                    pin = false;
                    break;
                }
            }
            else{
                for(int j=1 ;j<=9 ;j++){
                    LengthforSearch(number, j);
                }
            }
            if(!pin) break;
                
        }
        if(pin == true)
            System.out.println(-1);
        
    }
    public static void LengthforSearch(int[] number, int length){
        int value;
        int start=0;

        if(!pin)
            value = 0;
        else if(length == 9 || number[length+1] == -1){
            start = 1;
            value = 10;
        }
        else
            value = number[length+1];
        
        for(int i=start ; i<value ; i++){
            number[length] = i;

            //System.out.println(Arrays.toString(number) + " count : " +count);
            if(length > 0 && length < 10)
                LengthforSearch(number, length-1);
            else{
                count++;
                if(count==N){
                    pin = false;
                    PrintNumber(number);
                    //System.out.println(Arrays.toString(number) +"answer");
                }
            
            }
        }
    }
    public static void PrintNumber(int[] number){
        int length = 10;
        for(int i=0 ;i <10 ;i++)
            if(number[i]==-1){
                length = i;
                break;
            }
        
        for(int i=length-1 ; i>=0 ;i--){
            System.out.print(number[i]);
        }

    }
}
