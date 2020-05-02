import java.io.*;
import java.util.*;
class max_sum {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        long k = Long.parseLong(br.readLine());
        long sum = 0;
        int flag = 0;
        for(long i = k;i>0; i--){
            for(long j= k;j>0; j--){
                long pos = (long)Math.pow(i,2)-(i*j)-(long)Math.pow(j,2);
                if(pos==1|| pos==-1) {
                    sum = i+j;
                    flag = 1;
                    break;
                }
            }
            if(flag==1) break;
        }
        System.out.println(sum);
    }
}
