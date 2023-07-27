import java.util.*;
import java.io.*;
public class WeakData {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        long k = readLong();
        long limit = (long)1e6;
        Map<Long, Long> m = new HashMap<>();
        if(k == 0){
            System.out.println(1 + "\n" + 1);
            return;
        }
        for(long i = 0; i<=limit; i++){
            m.put(i*(i+1)/2, i);
        }
        for(long i = 1; i<=limit; i++){
            long rem = k-i*(i+1)/2;
            if(!m.containsKey(rem)){
                continue;
            }
            long p = i;
            long n = m.get(rem);
            if(n > 0) {
                if (p + 1 + n > limit) {
                    continue;
                }
                System.out.println(p + 1 + n);
                for (int K = 0; K < p; K++) {
                    System.out.print(0 + " ");
                }
                System.out.print(1 + " ");
                for (int K = 0; K < n - 1; K++) {
                    System.out.print(0 + " ");
                }
                System.out.println(0);
            } else {
                System.out.println(m);
                for(int K = 0; K<p-1; K++){
                    System.out.print(0 + " ");
                }
                System.out.println(0);
            }
            return;
        }
        System.out.println(-1);
    }
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}