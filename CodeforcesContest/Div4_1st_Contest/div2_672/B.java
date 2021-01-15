import java.io.*;
import java.util.*;
public class B {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int T = sc.nextInt();
        //int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = sc.nextInt();
            //int q = sc.nextInt();
            int arr[] = new int[N+7];
            int brr[] = new int[N+7];
            int count[] = new int[100+7];
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
                int Temp = (int)(Math.log(arr[i])/Math.log(2));
                count[Temp] ++;
            }
            long sum = 0;
            for(int i=0; i<100; i++){
                if(count[i]>1){
                    sum += ((long)count[i]*(count[i] -1))/2;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
