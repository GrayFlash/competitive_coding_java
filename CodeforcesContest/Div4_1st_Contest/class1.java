import java.io.*;
import java.util.*;
public class class1 {

    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        int t = Integer.parseInt(br.readLine());
        while(t-->0){

            int n = Integer.parseInt(br.readLine());
            int num = n;
            int pos=0, count=0;
            String str="";
            while(num>0){
                int dig = num%10;
                pos++;
                
                if(dig==0){
                    num /=10;
                    continue;
                }
                else{
                    count++;
                     str = (int)(dig*(Math.pow(10,pos-1))) + " "+str;
                }
                num/=10;
            }
            System.out.println(count+"\n"+str);
        }

    }
}
