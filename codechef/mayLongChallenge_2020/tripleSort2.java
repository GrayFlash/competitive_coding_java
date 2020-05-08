// Working program using Reader Class 
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class Main 
{ 
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
  
    public static void main(String[] args) throws IOException 
    { 
        Reader sc=new Reader(); 
        int T = sc.nextInt(); 
        while(T-->0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int ar[] = new int[N+7];
            for(int i=0; i<N; i++){
                ar[i] = sc.nextInt();
            }
            String str[] = new String[K+7];
            int pos = 0;
            int flag = 1;
            for(int i=0; i<N; i++){
                int x = ar[i];
                if(x==(i+1)) continue;
                int y = ar[x-1];
                if(x==ar[y-1]){
                    int grat = 0;
                    for(int j=i+1; j<N;j++) {
                        if(j==(y+1)){
                            grat = 1;
                            continue;
                        }
                        if((j+1)==(ar[j])) continue;
                        int z = ar[j];
                        if(grat==1){
                            ar[x-1] = x;
                            ar[j]= y;
                            ar[i] = z;
                            i--;
                            str[pos]= x+" "+y+" "+z;
                            pos++;
                            break;
                        }
                        else{
                            ar[i] = z;
                            ar[x-1] = x;
                            ar[j] = y;
                            str[pos] = x + " "+ z + " " + y;
                            i--;
                            pos++;
                            str[pos] = x + " "+ z + " " + y;
                            pos++;
                            break;
                        }
                    }
                }
                else{
                    int z = ar[y-1];
                    if(ar[z-1]==x){
                        if(z>y){
                            ar[x-1] = x;
                            ar[y-1] = y;
                            ar[z-1] = z;
                            str[pos] = x+" "+y+" "+z;
                            pos++;
                            i--;
                        }
                        else{
                            ar[x-1] = x;
                            ar[y-1] = y;
                            ar[z-1] = z;
                            str[pos] = x+" "+y+" "+z;
                            pos++;
                            str[pos] = x+" "+y+" "+z;
                            pos++;
                            i--;
                        }
                    }
                    else{
                        if(y>z){
                            ar[x-1] = x;
                            ar[i] = z;
                            ar[y-1] = y;
                            str[pos] = x+" "+y+" "+z;
                            pos++;
                            str[pos] = x+" "+y+" "+z;
                            pos++;
                            i--;   
                        }
                        else{
                            ar[i] = z;
                            ar[y-1] = y;
                            ar[x-1] = x;
                            str[pos] = x+" "+y+" "+z;
                            pos++;
                            i--;   
                        }
                    }
                    if(pos>K){
                        flag = 0; 
                        break;
                    }
                }
                if(pos>K){
                    flag = 0; 
                    break;
                }
            }
            if(flag==0) System.out.println("-1");
            else{
                System.out.println(pos);
                for(int i=0; i<pos; i++){
                    System.out.println(str[i]);
                }
            }
        }
    } 

    
} 