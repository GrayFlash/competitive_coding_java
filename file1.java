import java.io.*;
import java.util.*;
import java.math.*;
public class file1 {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String s[] = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);
            String s1[] = br.readLine().split(" ");
            int ar[] = new int[N+7];
            for(int i=0; i<N; i++){
                ar[i]=Integer.parseInt(s1[i]);
            }
            int count=0;
            int flag=0;
            int pos=0;
            for(int i=0; i<N; i++){
                if(ar[i]==K){
                    flag=1;
                    pos=1;
                    if((K-pos)==0){
                        count++;
                        flag=0;
                        pos=0;   
                    }
                }

                if(flag==1&&pos>0){
                    if(ar[i]==(K-pos)){
                        pos++;
                        if((K-pos)==0){
                            count++;
                            flag=0;
                            pos=0;   
                        }
                    }
                    else{
                        flag=0;
                        pos=0;
                    }
                }
                
            }
            System.out.println(count);
        }

        
    }
    
}