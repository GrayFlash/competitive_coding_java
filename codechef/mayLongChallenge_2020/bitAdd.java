import java.io.*;
import java.util.*;
class bitAdd{
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        Scanner sc = new Scanner (System.in);
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String s[] = br.readLine().split(" ");
            long X = Long.parseLong(s[0]);
            long Y = Long.parseLong(s[1]);
            long L = Long.parseLong(s[2]);
            long R = Long.parseLong(s[3]);
            long max_value = (X&R)*(Y&R);
            long max_num = R;
            for(long i=R; i>=L; i--){
                if(((X&i)*(Y&i))>=max_value){
                    max_value = (X&i)*(Y&i);
                    max_num = i;
                   
                }
                 //System.out.println(max_num+" "+ max_value);
            }
            System.out.println(max_num);
        }
    }
}