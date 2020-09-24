import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Vector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

class Codechef {
    static int[] arr = new int[200001];
    static boolean[] visted = new boolean[200001];

    public static Vector<Integer> func(int s) {
        int te = s;
        Vector<Integer> vec = new Vector<>();
        while (arr[te] != s) {
            visted[te] = true;
            vec.add(te);
            te = arr[te];
        }
        visted[te] = true;
        vec.add(te);
        return vec;
    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    public static int[] radixSort(int[] f) {
        return radixSort(f, f.length);
    }

    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static int[] radixSort(int[] f, int n) {
        int[] to = new int[n];
        {
            int[] b = new int[65537];
            for (int i = 0; i < n; i++)
                b[1 + (f[i] & 0xffff)]++;
            for (int i = 1; i <= 65536; i++)
                b[i] += b[i - 1];
            for (int i = 0; i < n; i++)
                to[b[f[i] & 0xffff]++] = f[i];
            int[] d = f;
            f = to;
            to = d;
        }
        {
            int[] b = new int[65537];
            for (int i = 0; i < n; i++)
                b[1 + (f[i] >>> 16)]++;
            for (int i = 1; i <= 65536; i++)
                b[i] += b[i - 1];
            for (int i = 0; i < n; i++)
                to[b[f[i] >>> 16]++] = f[i];
            int[] d = f;
            f = to;
            to = d;
        }
        return f;
    }

    // for(int i=0; i<n;i++){arr[i]=ob.nextInt(); }
    public static void main(String[] args) throws IOException {
        Reader ob = new Reader();
        int T = ob.nextInt();
        for (int t = 0; t < T; t++) {
            int n = ob.nextInt();
            int k = ob.nextInt();
            Arrays.fill(visted, false);
            Vector<Vector<Integer>> oddnumber = new Vector<>();
            Vector<Vector<Integer>> evennumber = new Vector<>();
            for (int j = 1; j <= n; j++) {
                arr[j] = ob.nextInt();
            }
            int count = 0, o = 0, e = 0;
            for (int j = 1; j <= n; j++) {
                if (!visted[j]) {
                    Vector<Integer> ve = func(j);
                    if (ve.size() % 2 == 1) {
                        o = o + ve.size() / 2;
                        oddnumber.add(ve);
                    } else {
                        e = e + (ve.size() - 1) / 2;
                        evennumber.add(ve);
                        count++;
                    }
                }
            }
            int total = o + e + count;
            if (count % 2 == 1 || total > k) {
              out.println(-1);
            } else {
                int to = 1;
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                out.println(total);
                for (Vector<Integer> v : oddnumber) {

                    for (int i = 1; i < v.size() - 1; i = i + 2) {
                        String str = v.get(0) + " " + v.get(i) + " " + v.get(i + 1);
                        map.put(to, str);
                        to++;
                    }
                }
                for (Vector<Integer> v : evennumber) {

                    for (int i = 1; i < v.size() - 1; i = i + 2) {
                        String str = v.get(0) + " " + v.get(i) + " " + v.get(i + 1);
                        map.put(to, str);
                        to++;
                    }
                }
                for (int i = 0; i < count - 1; i = i + 2) {
                    List<Integer> v1 = evennumber.get(i);
                    List<Integer> v2 = evennumber.get(i + 1);
                    int m = v1.get(0);
                    int m2 = v1.get(v1.size() - 1);
                    int m3 = v2.get(0);
                    int m4 = v2.get(v2.size() - 1);
                    String str = m + " " + m2 + " " + m3;
                    map.put(to, str);
                    to++;
                    String str2 = m4 + " " + m3 + " " + m;
                    map.put(to, str2);
                    to++;
                }
                for (int kk = 1; kk <=total; kk++) {
                    out.println(map.get(kk));
                }
            }
        }
        out.close();
    }
}