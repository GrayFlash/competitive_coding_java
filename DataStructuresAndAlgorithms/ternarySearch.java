import java.io.*;
public class ternarySearch {
    public static int TernarySearch(int L[], int left, int right, int key){
        if(right>=left){
            int mid1 = left + (right-left)/3;
            int mid2 = right - (right-left)/3;

            if(L[mid1]==key) return mid1;
            if(L[mid2]==key) return mid2;
            if(L[mid1]>key) return(TernarySearch(L, left, mid1-1, key));
            else if(L[mid2]<key) return(TernarySearch(L, mid2+1, right, key));
            else return(TernarySearch(L, mid1+1, mid2-1, key));
        }
        return -1;
    }
    public static void main(String srgs[] ) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the number of elements");
        int n = Integer.parseInt(br.readLine());
        int right = n;
        int left = 0;
        int L[] = new int[n+7];
        String s[] = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            L[i] = Integer.parseInt(s[i]);
        }
        System.out.println("Enter the Key to be found");
        int key = Integer.parseInt(br.readLine());
        int x;
        x = TernarySearch(L, left, right, key);
        if(x== -1){
            System.out.println("Key not found");
        }
        else {
            System.out.println("The position of key is "+(int)(x+1));
        }
    }
}