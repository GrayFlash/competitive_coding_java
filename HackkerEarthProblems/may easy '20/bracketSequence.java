import java.io.*;
import java.util.*;
public class bracketSequence {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        String s = br.readLine();
        int len = s.length();
        int open=0, close=0;
        for(int i=0; i<len; i++){
            if(s.charAt(i)=='(') open++;
            else close++;
        }
        if(len%2==1|| close!=open){
            System.out.println("0");
        }
        
        else{
            int count=0;
        for(int i=0; i<len; i++){
            String s2 = s.substring(i,len)+ s.substring(0,i);
            int open_brac = 0;
            int flag=1;
            for(int j=0; j<len; j++){
                if(s2.charAt(j)==')'){
                    if(open_brac == 0){
                        flag=0;
                        break;
                    }
                    else open_brac--;
                }
                else open_brac++;
            }
            if(flag==1) count++;
        }
        System.out.println(count);
        }
    }
}