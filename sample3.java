import java.io.*;
import java.util.*;
public class sample3 {

    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // Write your code here
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int S = Integer.parseInt(s[1]);
        Map <Integer, Integer> Buy = new HashMap<Integer, Integer>();
        Map <Integer, Integer> Sell = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            String s2[] = br.readLine().split(" ");
            char c1 = s2[0].charAt(0);
            int price = Integer.parseInt(s2[1]);
            int volume = Integer.parseInt(s2[2]);
            if(c1=='B'){
                if(Buy.containsKey(price)){
                    int vol = Buy.get(price);
                    Buy.put(price, vol+volume);
                }
                else{
                    Buy.put(price,volume);
                }
            }
            else{
                if(Sell.containsKey(price)){
                    int vol = Sell.get(price);
                    Sell.put(price, vol+volume);
                }
                else{
                    Sell.put(price,volume);
                }

            }
        }
        
    }
}