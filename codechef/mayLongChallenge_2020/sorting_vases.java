import java.io.*;
class sorting_vases {
    public static void main(String args[] ) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String s[] = br.readLine().split(" ");
            int N  = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            String s2[] = br.readLine().split(" ");
            int ar[] = new int[N+7];
            for(int i=0; i<N; i++){
                ar[i]= Integer.parseInt(s2[i]);
            }
            int X[] = new int[M+7];
            int Y[] = new int[M+7];        
            for(int i=0; i<M; i++){
                String s3[] = br.readLine().split(" ");
                X[i] = Integer.parseInt(s3[i]);
                Y[i] = Integer.parseInt(s3[i]);
            }
        }
    
    }

}