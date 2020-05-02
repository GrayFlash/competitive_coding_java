import java.io.*;
import java.util.*;
class printing_pattern {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        // Write your code here
        
        String s[] = br.readLine().split(" ");
        int r = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);
        int Ci = Integer.parseInt(s[2]);
        int Cj = Integer.parseInt(s[3]);
        int ar[][] = new int[r][c];
        ar[Ci][Cj] = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ar[i][j]=0;
            }
        }
       // while(flag==1){

        //}
        for(int i=0; i<r; i++){
            int t = 2*i+ 1;
            for(int j=0; j<t; j++){
                for(int k=0; k<t; k++){
                    if((Ci-j>=0&&Ci-j<=r)&&(Cj-k>=0&&Cj-k<=c)){
                    if(ar[Ci-j][Ci-k]==0) ar[Ci-j][Ci-k] = i+1;}
                }
            }
        }
        ar[Ci][Cj] = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
