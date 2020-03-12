
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int even = 0;
        int odd = 0;
        
             int ar[]  =new int[n + 5];
        for( int i=0; i<n;i++){
            ar[i] = Integer.parseInt(s[i]);
            /*ar[i] = Integer.parseInt(s[i]);
            if(ar[i]%2==0)
                even++;
            else
                odd++;*/
        }
        int kr[] = new int[1000];
            int z=0;
        int sum = 0;
        for(int i=0; i<(int)(Math.pow(2,n));i++){
            String binary = Integer.toBinaryString(i);
            int l = binary.length();
            int x = n-1;
            int num = 0;
            for(int j=l-1; j>=0;j--){
                num = num + Integer.parseInt( String.valueOf(binary.charAt(j)) )* ar[x];
                x--;
            }
            //System.out.print(num+ " ");
            
            if(num!=0 && num%2==0) {
                int flag = 0;
                for(int k=0; k<z;k++){
                    if(kr[k]==num){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                 sum++; 
                 kr[z] = num; 
                 z++;
                 
                }
            }
            
        }
    
    //    if(even>0&& odd>1)
          //  double sum = Math.pow(2, even)-2 + Math.pow(2,odd-1) +  (Math.pow (2,even)- 1) *(Math.pow (2 ,odd- 1)- 1) ;
   
    System.out.println(sum) ;
    }
}
