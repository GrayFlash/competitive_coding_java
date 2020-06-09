import java.io.*;
import java.util.*;
public class sample2 {

    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        int n = Integer.parseInt(br.readLine());
        int ar[] = new int[n+7];
        String s[] = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            ar[i] = Integer.parseInt(s[i]);
        }
        int pos1=0, pos2=n-1, sum1=0, flag=1;
        // int arr1[] = new int[n+7];
        // int arr2[] = new int[n+7];
        int tempSum1 = ar[pos1];
        int tempSum2 = ar[pos2];
        pos1++; pos2--;
        while(flag==1){

            while(tempSum1>tempSum2){
                tempSum2 += ar[pos2];
                pos2--;
            }
            while(tempSum1<tempSum2){
                tempSum1 += ar[pos1];
                pos1++;
            }
            if(tempSum1==tempSum2 && pos1<pos2){
                sum1 = tempSum1;
                break;
            }
            else flag=0;
        }
        System.out.println(sum1);
    }
}