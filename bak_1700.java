import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bak_1700 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] stuff =  new int[K];
        int[] stuff_count = new int[101];
        int[] multitab = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<K ;i++){
            stuff[i] = Integer.parseInt(st.nextToken());
            stuff_count[stuff[i]]++;
        }
        int result=0;
        int count =0;
        int isEmpty;

        for(int i=0 ; i<K ;i++){
            stuff_count[stuff[i]]--;
            if(count<N){
                isEmpty = 0;
                for(int j=0 ; j<count ; j++)
                    if(multitab[j] == stuff[i])
                     {    isEmpty =1;}
                if(isEmpty == 1)
                    continue;
                else{
                    multitab[count] = stuff[i];
                }
                count++;
            }
            else{
                
                int[] multitab_location = new int[N];
                int max = 0;
                int change_location=0;
                int check =0;
                for(int j=0 ; j<N ; j++)
                    if(multitab[j] == stuff[i]){
                        result --;
                        change_location = j;
                        check =1;
                        break;
                    }
                
                if(check==0){
                    for(int j=0 ;j<N ; j++){
                        if(stuff_count[multitab[j]]==0)
                            { change_location = j; break;}
                        for(int k=i ;k<K ;k++){
                            if(multitab[j] == stuff[k]){
                                multitab_location[j] = k;
                                if(max < k){
                                    max = k;
                                    change_location = j;
                                }
                                break;
                            }
                        }

                    }
                }
                //System.out.println(Arrays.toString(multitab_location));
                multitab[change_location]= stuff[i];
                result ++;


/*
                int min = stuff_count[multitab[0]];
                int min_location = 0;
                for(int j=0 ; j<N ; j++){

                    if(min >= stuff_count[multitab[j]]){
                        min_location = j;
                        min = stuff_count[multitab[j]];
                    }
                    if(stuff[i] == multitab[j]){
                        min_location = j;
                        result--;
                        break;
                    }
                        
                }
                multitab[min_location] = stuff[i];
                result++;*/
            }
            //System.out.println("multitab :" + Arrays.toString(multitab));
            //System.out.println("stuff_count : "+ Arrays.toString(stuff_count));
            //System.out.println(result);
        }
        System.out.println(result);

        

    }

}
