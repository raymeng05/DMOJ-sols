import java.util.*;
import java.io.*;
public class HolidayColouring {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        long n = readInt();
        long m = readInt();
        long max = Math.max(n, m);
        long min = Math.min(n, m);
        long r;
        long g;

        if((n*m) % 2 == 0){
            r = n*m/2;
            g = n*m/2;
        } else {
            r = (max/2+1) * min;
            g = (max/2) * min;
        }
        System.out.println(r + " " + g);
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