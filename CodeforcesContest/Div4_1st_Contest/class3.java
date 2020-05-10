import java.io.*;
import java.util.*;
public class class3 {

    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            //long num=0;
            int div = k/(n-1);
            int rem = k%(n-1);
            long ans=0;
            if(rem==0){
                ans = div*n -1;;
            }
           else{
               ans = div*n + rem;
           }
            System.out.println(ans);
        }
    }
}