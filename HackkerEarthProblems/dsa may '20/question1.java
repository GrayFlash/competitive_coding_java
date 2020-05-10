import java.io.*;
import java.util.*;
public class question1 {
    // public staic boolean fun(String s){
    //     int one = 0, zero = 0;
    //     for(int i = s.length() - 1; i >= 0; i--){
	// 	    if(s[i] is ‘0’):
	// 		    zero++
	// 	    else
	// 	    	one++
	//     	if(zero > one){
	// 		    return false;
    //         }
    //     }
    // return true;
    // }
    public static long combinations(long n, long y, int mod){
        long x = 1;
        for(long i=0; i<y; i++){
            x= x*(n-i)%mod;
        }
        for(long i=1; i<=y; i++){
            x = x/i;
        }
        return x;
    }
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        int mod = 999983;
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String s[] = br.readLine().split(" ");
            long x = Long.parseLong(s[0]);
            long y = Long.parseLong(s[1]);
            if(x>y) System.out.println("0");
            else{
                long comb = combinations((x+y),x,mod)%mod;
                System.out.println(comb);
            }
        }

    }
}
