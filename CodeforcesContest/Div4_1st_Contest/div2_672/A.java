import java.io.*;
import java.util.*;
public class A {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int T = sc.nextInt();
        //int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int N = sc.nextInt();
            int arr[] = new int[N+7];
            int brr[] = new int[N+7];
            Map<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
            int d = 0;
            for(int  i=0; i<N; i++){
                arr[i] = sc.nextInt();
                brr[i] = arr[i];
                if(hm1.containsKey(arr[i])){
                    d = 1;
                }
                else{
                    hm1.put(arr[i], 1);
                }
            }
            Arrays.sort(brr, 0, N);
            int flag = 1;
            for(int i=0; i<N; i++){
                if(arr[i] != brr[N-i-1]){
                    flag = 0;
                    break;
                }
            }
            if(flag == 0 || d==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
