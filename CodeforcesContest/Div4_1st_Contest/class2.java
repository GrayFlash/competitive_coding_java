import java.io.*;
import java.util.*;
public class class2 {

    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            String str = "";
            if(n%k==0){
                int div = n/k;
                System.out.println("YES");
                for(int i=0; i<k; i++){
                    System.out.print(div+" ");
                }
                System.out.println("");
            }
            else if((n%2==k%2)&&n>=k){
                int div = n/k;
                int x = n%k;
                System.out.println("YES");
                System.out.println((x+div)+" ");
                for(int i=0; i<k-1; i++){
                    System.out.print(div+" ");
                }
                System.out.println("");
            }
            else if(k%2==1&& n%2==0){
                int div = n/k;
                int ar[] = new int[div+7];
                int rem = n%k;
                for(int i=0; i<div; i++){
                    ar[i] = div;
                }
                ar[0] += rem;
                if(ar[0]%2!=ar[1]){
                    
                }
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
