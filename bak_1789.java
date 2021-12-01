import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class bak_1789 {
    public static void main(String[] args) throws Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //int S = Integer.parseInt(st.nextToken());
        
		Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        
        Stack<Long> stack = new Stack<>();
        ArrayList<Long> list = new ArrayList<>();
        long n=0;
        stack.add(S);
        long a = 0, b = 0;

        if(S==1)
            System.out.println(1);
        else{
            long count=0;
            while(true){
                count++;
                S-=count;
                if(S<=0) break;
            }
            if(S==0)count++;
            System.out.println(count-1);
        }
/*
        while(!stack.isEmpty()){
            n = stack.pop();
            if(n%2 == 0){
                for(long i=1 ; i<=n/2 ; i++){
                    if(!list.contains(n/2+i) && !list.contains(n/2-i)){
                        a  = n/2+i;
                        b = n/2-i;
                        list.add(a); list.add(b);
                        stack.add(a); stack.add(b);
                        list.remove(Long.valueOf(n));
                        break;
                    }
                }
            }
            else{
                for(long i=1 ; i<=n/2 ; i++){
                    if(!list.contains(n/2+i) && !list.contains(n/2)){
                        a  = n/2+i;
                        b = n/2;
                        list.add(a); list.add(b);
                        stack.add(a); stack.add(b);
                        list.remove(Long.valueOf(n));
                        break;
                    }
                }
            }
           // System.out.println("a="+a+", b="+b+", n="+n);
        }
        if(list.size()==0)
            System.out.println(1);
        else
            System.out.println(list.size());
    }
*/
/*
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n=0;
        stack.add(S);
        int a = 0, b = 0;

        while(!stack.isEmpty()){
            n = stack.pop();
            if(n%2 == 0){
                for(int i=1 ; i<=n/2 ; i++){
                    if(!list.contains(n/2+i) && !list.contains(n/2-i)){
                        a  = n/2+i;
                        b = n/2-i;
                        list.add(a); list.add(b);
                        stack.add(a); stack.add(b);
                        list.remove(Integer.valueOf(n));
                        break;
                    }
                }
            }
            else{
                for(int i=1 ; i<=n/2 ; i++){
                    if(!list.contains(n/2+i) && !list.contains(n/2)){
                        a  = n/2+i;
                        b = n/2;
                        list.add(a); list.add(b);
                        stack.add(a); stack.add(b);
                        list.remove(Integer.valueOf(n));
                        break;
                    }
                }
            }
           // System.out.println("a="+a+", b="+b+", n="+n);
        }
        */
    }
}
