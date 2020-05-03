import java.util.*;
public class soln1 {
    public static int[] solution(int area) {
        // Your code here
        int constantArea = area;
        int count = 0;
        int ar[] = new int[area+7];
        while(constantArea!=0){
            int sqroot = (int)Math.sqrt(area);
            if((sqroot*sqroot)==area){
                ar[count]= area;
                constantArea -= area;
                area = constantArea;
                count++;
            }
            else area--;
        }
        return ar;
    }
    public static void main(String args[]) throws Exception{
        soln1 x = new soln1();
        int t = Integer.parseInt(args[0]);
        int ar[] = x.solution(t);
        System.out.print(ar[0]);
        for(int i=1; i<ar.length-7; i++){
            System.out.print(","+ar[i]);
        }
    }
}