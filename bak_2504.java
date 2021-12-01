import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class bak_2504 {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] str= st.nextToken().toCharArray();

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> cal = new Stack<>();
        Stack<Integer> zone = new Stack<>();
        int[] zone_value =new int[30];
        int check = 1;

        int state = 0; //0이면 개괄상태, 1이면 폐괄상태
        for(int i=0 ; i<str.length ; i++){
            if(str[i]=='(' || str[i] =='['){
                if(str[i] == '(')
                    cal.add(2);
                else
                    cal.add(3);
                    
                zone.add(state);
                stack.add(parseChar(str[i]));
                //zone.add(state);
                state++;
            }
            else if(str[i]==')' || str[i] ==']'){
                if(state == 0){                    
                    System.out.println(0);
                    check =0;
                    break;
                }
                if(parseChar(str[i]) != stack.pop()+1){//이상한 식
                    System.out.print(0);
                    check = 0;
                    break;
                }
                state--;
            }
        }
        
        if(state != 0 && check !=0){                    
            System.out.println(0);
            check =0;
        }
        if(check == 1){
            while(!cal.isEmpty()){
                if(state == zone.peek()){
                    zone_value[state] += cal.pop();
                    zone.pop();
                }
                else if(state == zone.peek()+1){
                    state = zone.pop();
                    zone_value[state] += cal.pop() * zone_value[state+1];
                    zone_value[state+1] = 0;
                }
                else{
                    state = zone.pop();
                    zone_value[state] += cal.pop();
                }
            }
            
            System.out.println(zone_value[0]);
        }
    }

    public static int parseChar(char a){
        if(a=='(')
            return 0;
        else if(a==')')
            return 1;
        else if(a=='[')
            return 3;
        else if(a==']')
            return 4;
        else
            return -1;
    }
}
