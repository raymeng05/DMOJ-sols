import java.util.*;
import java.io.*;
public class PairingGifts {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        long k = readLong();
        long m = readLong();
        Map<Long, Integer> newYear = new HashMap<>();
        long[] christArr = new long[n];
        long[] newArr = new long[n];
        for(int i = 0; i<n; i++){
            christArr[i] = readLong();
        }
        for(int i = 0; i<n; i++){
            newArr[i] = readLong();
            newYear.put(newArr[i], i);
        }
        int count = 0;
        for(int i = 0; i<n; i++){
            if(newYear.containsKey((m-christArr[i])) && Math.abs(i-newYear.get(m-christArr[i])) >= k){
                count++;
            }
        }
        System.out.println(count);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
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