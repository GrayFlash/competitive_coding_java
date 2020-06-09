import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        long A = sc.nextLong();
        long B = sc.nextLong();
        long count = 0;
        Map <Long, Integer> unique = new HashMap<Long, Integer>();
        for(long i=A; i<=B; i++){
            for(long j=i; j<=B; j++){
                long or_op = i|j;
                System.out.println(i+" "+j+" "+ or_op);
                if(unique.containsKey(or_op)) continue;
                unique.put(or_op, 1);
                count++;
            }
        }
        System.out.println(1|100);
        System.out.println(count);
    }
}
