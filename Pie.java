import java.util.*;
import java.io.*;
public class Pie {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException  {
        int n = readInt();
        int m = readInt();
        double[] arr = new double[n+1];
        double remaining = 1.0;
        for(int i = 0; i<m; i++){
            int a = readInt();
            double p = readDouble();
            double temp = p*0.01*remaining;
            arr[a] += temp;
            remaining -= temp;
        }
        for(int i = 1; i<=n; i++){
            System.out.println(arr[i]);
        }
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