import java.io.*;
import java.util.*;
public class samplefile {

    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int com=0, n1=0, n2=0;
        Map <String, Integer> h1 = new HashMap<String, Integer>();
        Map <String, Integer> h2 = new HashMap<String, Integer>();
        Map <String, Integer> common = new HashMap<String, Integer>();
        for(int i=0; i<n; i++){
            String s1 = br.readLine();
            h1.put(s1,1);
            n1++;
        }
        for(int i=0; i<m; i++){
            String s1 = br.readLine();
            if(h1.containsKey(s1)){
                common.put(s1,1);
                h1.remove(s1);
                com++;
                n1--;
            }
            else{
                h2.put(s1,1);
                n2++;
            } 
        }
        int point1 = n1 + com/2 + com%2;
        int point2 = n2 + com/2;
        if(point1>point2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}