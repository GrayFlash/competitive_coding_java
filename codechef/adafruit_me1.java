import java.io.*;
import java.util.*;
class adashop2{
    public static void main( String args[] ) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        int begin=0;
        int t = Integer.parseInt(br.readLine());
        int arr[][] = {{1,1},{2,2},{3,3},{4,4},{5,5},{6,6},{7,7},{8,8},{7,7},{8,6}, {7,5},{6,4},{5,3},{4,2},{3,1},{2,2},{1,3},{2,4},{3,5},{4,6},{5,7},{6,8},{5,7},{6,6},{7,5},{8,4},{7,3},{6,2},{5,1},{4,2},{3,3},{2,4},{1,5},{2,6},{3,7},{4,8},{3,7},{4,6},{5,5},{6,4},{7,3},{8,2},{7,1},{6,2},{5,3},{4,4},{3,5},{2,6},{1,7},{2,8}};
        int j;
        for(int i=0; i<t; i++){
            int count =0;
            String s[] = br.readLine().split(" ");
            int row = Integer.parseInt(s[0]);
            int col = Integer.parseInt(s[1]);
            String s_out [] = new String[64];
            for(j=0; j<50;j++){
                if(arr[j][0]==row&&arr[j][1]==col){
                    begin =j;
                    break;
                }
            }
            s_out[0] = row+" "+col;
            count++;
            for( j=begin; j<50; j++){
                if(arr[j][0]==8&&arr[j][1]==8){
                    s_out[count]=arr[j][0]+" "+arr[j][1];
                    count++;
                    s_out[count]=arr[j+1][0]+" "+arr[j+1][1];
                    count++;
                }
                else if(arr[j][0]==8||arr[j][0]==8||arr[j][1]==8||arr[j][0]==1){
                    s_out[count]=arr[j][0]+" "+arr[j][1];
                    count++;
                }
            }
            for(j=49; j>=0; j--){
                if(arr[j][0]==8&&arr[j][1]==8){
                    s_out[count]=arr[j][0]+" "+arr[j][1];
                    count++;
                    s_out[count]=arr[j+1][0]+" "+arr[j+1][1];
                    count++;
                }
                else if(arr[j][0]==8||arr[j][0]==8||arr[j][1]==8||arr[j][0]==1){
                    s_out[count]=arr[j][0]+" "+arr[j][1];
                    count++;
                }
            }
            System.out.println(count);
            for(j=0; j<count;j++){
                System.out.println(s_out[j]);
            }
            }
        }
    }
