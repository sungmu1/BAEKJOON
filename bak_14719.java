import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class bak_14719 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height= Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int result =0;
        int[] block = new int[width];
        for(int i = 0 ; i<width ; i++){
            block[i] = Integer.parseInt(st.nextToken());
            if(block[i] > height)
                block[i] = height;
        }
        
        int[] water = new int[width];
        Integer[] block_sorting = Arrays.stream(block).boxed().toArray(Integer[]::new) ;
        Arrays.sort(block_sorting, Collections.reverseOrder());

        int count = 0; //sorting된 배열의 큰 것부터 지우기 위한 count
        int start = 0;
        int start_height = block[0];

        if(start_height == block_sorting[0]){
            int max=0;
            for(int i=1 ; i<width ; i++)
                if(block[0] >= block[i]){ max = Math.max(max,block[i]); start_height = max; }
                else { start_height = block[i]; break; }
        }

        for(int i=1 ; i<width; i++){
                if(start_height > block[i]){
                    result += start_height - block[i];
                }
                else{
                    //block_sorting에서 현재 start_height 찾아서 -1로 조져버리기
                    int max=0;
                    for(int j=i+1 ; j<width ; j++)
                        if(block[i] >= block[j]){ max = Math.max(max,block[j]); start_height = max; }
                        else { start_height = block[i]; break; }
                    start = i;
                }

            System.out.print("start point : "+start+", ");
            System.out.print("height : "+start_height+", ");
            System.out.println("water : "+result+", ");
        }
        System.out.println(result);


    }
}
