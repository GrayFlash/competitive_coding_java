public class Solution {
    public static double squareRoot(int number) {
	double temp;

	double sr = number / 2;

	do {
		temp = sr;
		sr = (temp + (number / temp)) / 2;
	} while ((temp - sr) != 0);

	return sr;
    }
    public static int[] solution(int area) {
        // Your code here
        int constantArea = area;
        int count = 0;
        int ar[] = new int[area+7];
        while(constantArea!=0){
            int sqroot = (int)squareRoot(area);
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
    
}