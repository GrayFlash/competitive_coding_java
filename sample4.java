import java.util.*;
public class sample4{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        long ar[] = new long[N+7];
        for(int i=0; i<N; i++){
            ar[i] = sc.nextLong();
        }
        for(int i=0; i<N; i++){
            int pos= sc.nextInt();
            ar[pos-1] = -1;
            long max=0;
            long current=0;
            for(int j=0; j<N;j++){
                if(ar[j]== -1){
                    if(current>max) max=current;
                    current=0;
                    continue;
                }
                //System.out.print(ar[j]+ " ");
                current += ar[j];
            }
            if(current>max) max=current;
            System.out.println(max);
        }
    }
}