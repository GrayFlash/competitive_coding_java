import java.io.*;
import java.util.*;
public class xor_engine
{
   public static void main(String args[]) throws Exception{
       BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
       int t =Integer.parseInt(br.readLine());
       for(int i=0; i<t; i++){
           String s[] = br.readLine().split(" ");
           int n = Integer.parseInt(s[0]);
           int q = Integer.parseInt(s[1]);
           int arr[] = new int[n+7];
           
           String s2[] = br.readLine().split(" ");
           for(int j=0; j<n; j++){
               arr[j] = Integer.parseInt(s2[j]);}
           for(int j=0; j<q;j++){
               int odd=0;
               int brr[]=new int[n+7];
               int p = Integer.parseInt(br.readLine());
               for(int k=0; k<n; k++){
                   brr[k]= arr[k]^p;
                   int count=0;
                   while(brr[k]>0){
                     if(brr[k]%2==1)count++;
                     brr[k]/=2;
                    }
                    if(count%2==1) odd++;
                }
                System.out.println(odd+" "+(n-odd));
                }
            }
        }
    }