import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bak_10798 {
    public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = new String[5];
            for(int i=0 ; i<5; i++)
                str[i] = br.readLine();
            Read read_a = new Read(str);
            read_a.readExecute();
    }
        

    public static class Read{
        String[] string_read;
        int[] string_len;
        int max_len;
        
        Read(String[] string_read){
            this.string_read = string_read;
            int[] string_len = new int[string_read.length];
            int max_len =0;
            for(int i=0 ; i<string_read.length ; i++){
                string_len[i] = string_read[i].length();
                max_len = Math.max(max_len, string_len[i]);
            }
            
            this.string_len = string_len;
            this.max_len = max_len;
        }
        public void readExecute(){
            for(int i=0 ; i<max_len ; i=i+2){
                for(int j=0 ; j<string_len.length ; j++){
                    if(string_len[j] > i)
                        System.out.print(string_read[j].charAt(i));
                }
                
            }
        }
    }
}