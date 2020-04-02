<<<<<<< HEAD
import java.io.*;
//import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int t = Integer.parseInt(br.readLine());
        for(int test_loop = 0; test_loop<t; test_loop++){
            String s1[] = br.readLine().split(" ");
        int col = Integer.parseInt(s1[0]);
        int row = Integer.parseInt(s1[1]);
        String heading[] = br.readLine().split(" ");
        int len[]= new int[col+7];
        String arr[][] = new String[row+7][col+7];
        for(int i=0; i<col; i++){
            len[i] = heading[i].length();
        }
        for(int i=0; i<row; i++){
            String s2[] = br.readLine().split(" ");
            for(int j=0; j<col; j++){
                arr[i][j] = s2[j];
                if(s2[j].length()>len[j]) len[j] = s2[j].length();
            }
        }
        // printing the first box
        System.out.print("+");
        for(int i=0; i<col; i++){
            for(int j=0; j<len[i]+2;j++){
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println("");
        
        //printing the heading line
        System.out.print("|");
        for(int i=0;i<col; i++){
            System.out.print(" ");
            System.out.print(heading[i]);
            int diff = len[i]-heading[i].length();
            for(int j=0; j<=diff;j++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println("");

        // printing the first box
        System.out.print("+");
        for(int i=0; i<col; i++){
            for(int j=0; j<len[i]+2;j++){
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println("");
                // printing the content
        for(int i=0; i<row; i++){
            System.out.print("|");
            for(int j=0; j<col; j++){
                int flag=0;
                if(arr[i][j].length()>2){
                    int l = arr[i][j].length();
                    char c1 = arr[i][j].charAt(2);
                    char c2 = arr[i][j].charAt(l-3);
                    if((c1>=48)&&(c1<58)&&(c2<58)&&c2>=48) flag=1;
                }
                else{
                      if((arr[i][j].charAt(0)>=48&&(arr[i][j].charAt(0)<58))) flag=1;
                }
                //else System.out.print("-");
                if(flag==0){
                System.out.print(" ");
                System.out.print(arr[i][j]);
                int diff = len[j]-arr[i][j].length();
                for(int k=0; k<=diff;k++){
                   System.out.print(" ");
                }}
                else{
                    int diff = len[j]-arr[i][j].length();
                    for(int k=0; k<=diff;k++){
                     System.out.print(" ");
                    }  
                    System.out.print(arr[i][j]);
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println("");
        }

        // last nail in the coffin
        System.out.print("+");
        for(int i=0; i<col; i++){
            for(int j=0; j<len[i]+2;j++){
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println("");


        }
    }
}
=======
import java.io.*;
//import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int t = Integer.parseInt(br.readLine());
        for(int test_loop = 0; test_loop<t; test_loop++){
            String s1[] = br.readLine().split(" ");
        int col = Integer.parseInt(s1[0]);
        int row = Integer.parseInt(s1[1]);
        String heading[] = br.readLine().split(" ");
        int len[]= new int[col+7];
        String arr[][] = new String[row+7][col+7];
        for(int i=0; i<col; i++){
            len[i] = heading[i].length();
        }
        for(int i=0; i<row; i++){
            String s2[] = br.readLine().split(" ");
            for(int j=0; j<col; j++){
                arr[i][j] = s2[j];
                if(s2[j].length()>len[j]) len[j] = s2[j].length();
            }
        }
        // printing the first box
        System.out.print("+");
        for(int i=0; i<col; i++){
            for(int j=0; j<len[i]+2;j++){
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println("");
        
        //printing the heading line
        System.out.print("|");
        for(int i=0;i<col; i++){
            System.out.print(" ");
            System.out.print(heading[i]);
            int diff = len[i]-heading[i].length();
            for(int j=0; j<=diff;j++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println("");

        // printing the first box
        System.out.print("+");
        for(int i=0; i<col; i++){
            for(int j=0; j<len[i]+2;j++){
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println("");
                // printing the content
        for(int i=0; i<row; i++){
            System.out.print("|");
            for(int j=0; j<col; j++){
                int flag=0;
                if(arr[i][j].length()>2){
                    int l = arr[i][j].length();
                    char c1 = arr[i][j].charAt(2);
                    char c2 = arr[i][j].charAt(l-3);
                    if((c1>=48)&&(c1<58)&&(c2<58)&&c2>=48) flag=1;
                }
                else{
                      if((arr[i][j].charAt(0)>=48&&(arr[i][j].charAt(0)<58))) flag=1;
                }
                //else System.out.print("-");
                if(flag==0){
                System.out.print(" ");
                System.out.print(arr[i][j]);
                int diff = len[j]-arr[i][j].length();
                for(int k=0; k<=diff;k++){
                   System.out.print(" ");
                }}
                else{
                    int diff = len[j]-arr[i][j].length();
                    for(int k=0; k<=diff;k++){
                     System.out.print(" ");
                    }  
                    System.out.print(arr[i][j]);
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println("");
        }

        // last nail in the coffin
        System.out.print("+");
        for(int i=0; i<col; i++){
            for(int j=0; j<len[i]+2;j++){
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println("");


        }
    }
}
>>>>>>> b37f099c1a12cf1f407d9f644cf774c1b74e2cb2
