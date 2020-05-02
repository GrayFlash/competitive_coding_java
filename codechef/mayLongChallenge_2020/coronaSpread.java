import java.io.*;
import java.util.*;
class testClass{
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        Scanner sc = new Scanner (System.in);
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int n  = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            int count[] = new int[n+7];
            int ar[] = new int[n+7];
            int x = 0;
            for(int i=0; i<n; i++){
                if(i==0){
                    count[x]++;
                    ar[i] = Integer.parseInt(s[i]);
                }
                else{
                    ar[i] = Integer.parseInt(s[i]);
                    if(ar[i]-ar[i-1]>2){
                        x++;
                    }
                    count[x]++;
                }
            }
            int min = count[0];
            int max = count[0];
            for(int i=0; i<=x;i++){
                if(count[i]>max) max = count[i];
                if(count[i]<min) min = count[i];
            }
            System.out.println(min+" "+ max);
        }
        
    }
}