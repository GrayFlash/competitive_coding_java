import java.io.*;
//import java.util.*;
class tripleSort{
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        //Scanner sc = new Scanner (System.in);
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String s[] = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);
            String s1[]= br.readLine().split(" ");
            int ar[] = new int[N+1];
            for(int i=0; i<N; i++){
                ar[i] = Integer.parseInt(s1[i]);
            }
            String str[] = new String[K+7];
            int pos=0, flag=1;
            for(int i=0; i<N; i++){
                if(ar[i]==(i+1)) continue;
                
                int x = ar[i];
                int y = ar[x-1];
                int z = ar[y-1];
                if(x==z){
                    for(int j=i+1; j<N; j++){
                        if(ar[j]==(j+1)) continue;
                        if(ar[j]==z) continue;
                        if(ar[j]==y) continue;
                        z = ar[j];
                        ar[y-1] = y;
                        ar[i] = z;
                        ar[x-1] = x;
                        str[pos] = x+" "+y+" "+z;
                        pos++;
                        i--;
                        break;
                    }
                }
                else if(x==ar[z]){ // doubt for this check by increasing 2
                   
                    ar[y-1] = y;
                    ar[x-1] = x;
                    ar[z-1] = z;
                    str[pos] = x+" "+y+" "+z;
                    pos++;
                    i--;
                    
                }
                else{   //doubt for this case
                    ar[y-1] = y;
                    ar[i] = z;
                    ar[x-1] = x;
                    str[pos] = x+" "+y+" "+z;
                    pos++;
                    //System.out.println("Here");
                    i--;
                }
                if(pos>K) {
                    flag= 0;
                    break;
                }
            }
            for(int i=0; i<N;i++){
                System.out.print(ar[i]+" ");
            }
            if(flag==0) System.out.println("\n-1");
            else{
                System.out.println("\n"+pos);
                for(int i=0; i<pos;i++){
                    System.out.println(str[i]);
                }
            }
        }
    }
}