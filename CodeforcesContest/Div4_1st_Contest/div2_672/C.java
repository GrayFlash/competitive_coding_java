import java.io.*;
import java.util.*;
public class C {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int T = sc.nextInt();
        //int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = sc.nextInt();
            int q = sc.nextInt();
            int arr[] = new int[N+7];
            int brr[] = new int[N+7];
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
                brr[i] = arr[i];
            }
            long sum = 0;
            Arrays.sort(brr, 0, N);
            int mid_val = brr[N/2];
            int prev = -1;
            for(int i=0; i<N; i++){
                if(prev==-1 && arr[i]>=mid_val){
                    sum += arr[i];
                    prev = 1;
                }
                if(prev==1 && arr[i] < mid_val){
                    sum -= arr[i];
                    prev = -1;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
