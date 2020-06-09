// import java.io.*;
// import java.util.*;
// public class gfg_priorityQueue {
//     public static void main(String args[]) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
//         int T= Integer.parseInt(br.readLine());
//         PriorityQueue <Long> pQueue = new PriorityQueue<Long>();
//         String s[] = br.readLine().split(" ");
//         for(int i=0; i<T; i++){
//             long num = Long.parseLong(s[i]);
//             pQueue.add(num);
//         }
//         System.out.println(""+pQueue.poll()+" "+pQueue.peek());
//         Iterator itr = pQueue.iterator();
//         while (itr.hasNext()) 
//         System.out.print(itr.next()); 

//     }
// }
import java.io.*;
import java.util.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String s[] = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int T = Integer.parseInt(s[1]);
        PriorityQueue <Long> pq = new PriorityQueue <Long>();
        String s2[] = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            long num = Long.parseLong(s2[i]);
            if(num==0){
                int x=0;
                Iterator itr1 = pq.iterator();
                while(itr1.hasNext() && x<T){
                   pq.pop();
                    x++;
                }
            }
            else{
                pq.add(num);
            }
        }
        Iterator itr = pq.iterator(); 
        BigInteger sum = new BigInteger("0");
        while (itr.hasNext()){
            sum = sum.add(BigInteger.valueOf((long)itr.next()));
        }
        System.out.println(sum);
    }
}
