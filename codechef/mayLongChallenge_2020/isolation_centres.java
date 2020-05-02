import java.io.*;
import java.util.*;
class testClass{
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        Scanner sc = new Scanner (System.in);
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]);
            String condn = br.readLine();
            int count[] = new int[26];
            for(int i=0; i<26; i++){
                count[i]=0;
            }
            for(int i=0; i<n; i++){
                char ch = condn.charAt(i);
                count[ch-97]++;
            }
            Arrays.sort(count,0,26);
            while(q-->0){
                int sum = 0;
                int query = Integer.parseInt(br.readLine());
                for(int j = 25; j>=0; j--){
                    if(query>count[j]) break;
                    sum += (count[j]-query);
                }
                System.out.println(sum);
            }
        }
    }
}